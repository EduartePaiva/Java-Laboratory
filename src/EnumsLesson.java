public class EnumsLesson {
    enum Status {
        Running, Failed, Pending, Success;
    }

    enum Laptop {
        MacBook(2000), ThinkPad(1500), XPS(2200), Surface(1800);

        private int price;

        private Laptop(int price) {
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }
    }

    void main() {
        Status s = Status.Failed;

        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        for (Status sta : ss) {
            System.out.println(sta + " : " + sta.ordinal());

        }

        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        // Laptop lap = Laptop.MacBook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }

}
