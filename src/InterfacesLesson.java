// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

public class InterfacesLesson {
    interface A {
        int age = 28;
        String area = "Brazil";

        void show();

        void config();
    }

    interface X {
        void run();
    }

    interface Y extends X {

    }

    class B implements A, X {

        public void show() {
            System.out.println("in show");
        }

        public void config() {
            System.out.println("in config");
        }

        public void run() {
            System.out.println("running");
        }
    }

    interface Computer {
        void code();
    }

    class Laptop implements Computer {
        public void code() {
            System.out.println("coding in laptop");
        }
    }

    class Desktop implements Computer {
        public void code() {
            System.out.println("coding in desktop");
        }
    }

    class Developer {
        public void devApp(Computer c) {
            c.code();
        }
    }

    void main() {
        A obj = new B();
        obj.show();
        obj.config();

        Developer dev = new Developer();
        Laptop laptop = new Laptop();
        Desktop desktop = new Desktop();

        dev.devApp(desktop);
        dev.devApp(laptop);
    }

}
