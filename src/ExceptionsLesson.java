public class ExceptionsLesson {

    class MyException extends Exception {
        public MyException(String s) {
            super(s);
        }
    }

    void main() {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;

            if (j == 0) {
                throw new MyException("I dont want to print zero");
            }
        } catch (MyException e) {
            j = 18 / 1;
            System.out.println("That's the default output " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong.." + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
