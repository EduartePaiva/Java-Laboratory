import java.util.Arrays;
import java.util.List;

public class MethodReferenceLesson {
    class Student {
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    void main() {

        // method ref exemple
        List<String> names = Arrays.asList("Navin", "Edu", "Carlos", "Ana");

        List<String> uNames = names.stream().map(String::toUpperCase).toList();

        uNames.forEach(System.out::println);

        // constructor ref example

        List<Student> students = names.stream().map(Student::new).toList();

        System.out.println(students);

    }
}
