import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsLesson {
    void main() {
        System.out.println("\n---------ARRAY LIST-----------\n");

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2));

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("\n---------HASH SET-----------\n");

        Set<Integer> nums2 = new HashSet<>();
        nums2.add(86);
        nums2.add(65);
        nums2.add(78);
        nums2.add(42);

        for (int n : nums2) {
            System.out.println(n);
        }

        System.out.println("\n----------TREE SET----------\n");

        Set<Integer> nums3 = new TreeSet<>();
        nums3.add(86);
        nums3.add(65);
        nums3.add(78);
        nums3.add(42);

        for (int n : nums3) {
            System.out.println(n);
        }

        System.out.println("\n----------MAP----------\n");

        Map<String, Integer> students = new HashMap<>();

        students.put("Edu", 56);
        students.put("Ana", 23);
        students.put("Alice", 67);
        students.put("Davi", 90);
        students.put("Ana", 45);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
