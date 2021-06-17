import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Describes HTTP Client in java api
 *
 * @author Sup4eg
 */

public class HttpClientJava11 {

    static class Get {
        static void main(String[] args) {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://winterbe.com"))
                    .GET()
                    .build();
            var client = HttpClient.newHttpClient();
            HttpResponse<String> response = null;
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            assert response != null;
            System.out.println(response.body());
        }
    }

    static class Post {
        public static void main(String[] args) {
            var postRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://postman-echo.com/post"))
                    .header("Content-Type", "text/plain")
                    .POST(HttpRequest.BodyPublishers.ofString("Hi there!"))
                    .build();
            var postClient = HttpClient.newHttpClient();
            HttpResponse<String> responsePost = null;
            try {
                responsePost = postClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            assert responsePost != null;
            System.out.println(responsePost.statusCode());
        }
    }

    static class BasicAuth{
        public static void main(String[] args) {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://postman-echo.com/basic-auth"))
                    .build();
            var client = HttpClient.newBuilder()
                    .authenticator(new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("postman", "password".toCharArray());
                        }
                    }).build();
            HttpResponse<String> response = null;
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            assert response != null;
            System.out.println(response.statusCode());
        }
    }

}
