public class AbstractLesson {
    abstract class Car {

        public abstract void drive();

        public void playMusic() {
            System.out.println("play music");
        }
    }

    class WagnoR extends Car {

        @Override
        public void drive() {
            System.out.println("driving");
        }

    }

    void main() {
        Car obj = new WagnoR();
        obj.drive();
        obj.playMusic();

        // anonymous abstract inner class
        Car obj2 = new Car() {
            public void drive() {
                System.out.println("some car driving");
            }
        };
        obj2.drive();
    }
}
