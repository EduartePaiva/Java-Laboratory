public class FunctionalInterfacesLesson {
    @FunctionalInterface
    interface A {
        int add(int i, int j);
    }

    void main() {
        A obj = new A() {
            @Override
            public int add(int i, int j) {
                return i + j;
            }
        };

        int result = obj.add(5, 4);
        System.out.println(result);

        A obj2 = (i, j) -> i + j;

        System.out.println(obj2.add(10, 5));
    }
}
