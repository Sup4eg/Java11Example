import java.util.Optional;

/**
 * Describes new features in Optional api. java11
 * @author Sup4eg
 */

public class OptionalApiJava11 {
    public static void main(String[] args) {
        var optional = Optional.of("foo").orElseThrow();
        System.out.println(optional);
        System.out.println(Optional.of("foo").stream().count());
        System.out.println(Optional.ofNullable(null).or(() -> Optional.of("fallback")).get());
    }
}
