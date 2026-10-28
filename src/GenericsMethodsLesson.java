public class GenericsMethodsLesson {
    // Generics = enable types (classes and interfaces) to be parameters when
    // defining:
    // classes, interfaces and methods
    // a benefit is to eliminate the need to create multiple versions of methods
    // or classes for various data types.
    // Use 1 version for all references data types.

    void main() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1, };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E" };

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }

    // generic method
    private static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static <T> T getFirst(T[] array) {
        return array[0];
    }
}
