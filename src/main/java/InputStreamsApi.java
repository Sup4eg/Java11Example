import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Describes input stream with new try feature in java11
 * @author Sup4eg
 */

public class InputStreamsApi {
    public static void main(String[] args) throws IOException {
        var classLoader = ClassLoader.getSystemClassLoader();
        var inputStream = classLoader.getResourceAsStream("myFile");
        var tempFile = File.createTempFile("myFileCopy", "txt");
        try (var outputStream = new FileOutputStream(tempFile)) {
            assert inputStream != null;
            inputStream.transferTo(outputStream);
        }
    }
}
