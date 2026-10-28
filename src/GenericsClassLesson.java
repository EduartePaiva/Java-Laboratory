public class GenericsClassLesson {
    // Generics = enable types (classes and interfaces) to be parameters when
    // defining:
    // classes, interfaces and methods
    // a benefit is to eliminate the need to create multiple versions of methods
    // or classes for various data types.
    // Use 1 version for all references data types.

    void main() {
        GenericValue<Integer> myInt = new GenericValue<>(1);
        int intVal = myInt.getValue();

        System.out.println(intVal);
    }

    private class GenericValue<T extends Number> {
        private T value;

        GenericValue(T value) {
            this.value = value;

            value.byteValue();
        }

        public T getValue() {
            return this.value;
        }
    }

}
