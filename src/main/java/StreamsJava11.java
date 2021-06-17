import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Describes new streams features in java11
 * @author Sup4eg
 */

public class StreamsJava11 {

    public static void main(String[] args) {
        System.out.println(Stream.ofNullable(null).count());

        //include 3
        var listOfDrop = Stream.of(1, 2, 3, 2, 1)
                .dropWhile(n -> n < 3)
                .collect(Collectors.toList());
        System.out.println(listOfDrop);

        //not include 3
        List<Integer> listOfTake = Stream.of(1, 2, 3, 2, 1)
                .takeWhile(n -> n < 3)
                .collect(Collectors.toList());
        System.out.println(listOfTake);

    }

}
