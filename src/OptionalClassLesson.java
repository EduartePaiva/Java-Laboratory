import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassLesson {
    void main() {
        List<String> names = Arrays.asList("Navin", "Edu", "Carlos", "Ana");

        Optional<String> name = names.stream().filter(n -> n.contains("u")).findFirst();

        System.out.println(name.get());

        System.out.println(name.orElse("not found"));
    }
}
