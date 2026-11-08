import java.util.Arrays;
import java.util.List;

public class StreamAPILesson {
    void main() {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        nums.forEach(n -> System.out.println(n));

        Integer sum = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (i, j) -> i + j);

        System.out.println(sum);

    }
}