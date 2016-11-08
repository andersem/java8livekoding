import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> stringer = Arrays.asList("hehehe", "haha", "l", "999", "hahe");



        System.out.println(stringer.stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble());

        stringer.stream()
                .filter(string -> string.contains("h"))
                .filter(string -> string.contains("a"))
                .findFirst();

    }
}
