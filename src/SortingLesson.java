import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLesson {
    class Student implements Comparable<Student> {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;

        }

        @Override
        public String toString() {
            return "Student [age=" + age + ", name=" + name + "]";
        }

        @Override
        public int compareTo(SortingLesson.Student that) {
            if (this.age > that.age)
                return 1;
            else
                return -1;

        }
    }

    void main() {
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(98);
        nums.add(29);

        Collections.sort(nums);

        System.out.println(nums);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums, com);

        System.out.println(nums);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Edu"));
        studs.add(new Student(23, "Ana"));
        studs.add(new Student(25, "Alice"));
        studs.add(new Student(30, "Clara"));
        studs.add(new Student(18, "Carlos"));

        // implementing comparable
        // Collections.sort(studs);

        // using lambda
        Collections.sort(studs, (i, j) -> i.age > j.age ? 1 : -1);

        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
