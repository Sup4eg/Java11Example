import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Describes new collections features in java11
 * @author Sup4eg
 */

public class CollectionApiJava11 {

    public static void main(String[] args) {
        var list = List.of("A", "B", "C");
        var copy = List.copyOf(list);
        System.out.println(list == copy);
        System.out.println("-".repeat(20));

        var list1 = new ArrayList<String>();
        var copy1 = List.copyOf(list1);
        System.out.println(list1 == copy1);
        System.out.println("-".repeat(20));

        var map = Map.of("A", 1, "B", 2);
        System.out.println(map);


    }
}
