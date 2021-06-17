/**
 * Describes Strings in java11
 * @author Sup4eg
 */

public class StringsJava11 {
    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" Foo Bar ".strip()); //strip both
        System.out.println(" Foo Bar ".stripTrailing()); //strip at the end
        System.out.println(" Foo Bar ".stripLeading()); //strip at the beginning
        System.out.println("Java".repeat(3));
        System.out.println("A\nB\nC".lines().count());
    }
}
