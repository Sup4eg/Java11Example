import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Describes var in java11
 * @author Sup4eg
 */

public class VarExample {
    public static void main(String[] args) {
//        String text1 = "text example";
        var text2 = "text with var";
        System.out.println(text2);

        var myList = new ArrayList<Map<String, List<Integer>>>();
        var map = new HashMap<String, List<Integer>>();
        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        map.put("list", list);
        myList.add(map);
        for (var current: myList) {
            System.out.println(current);
        }
    }
}
