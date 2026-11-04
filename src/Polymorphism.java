class Computer {
    public void show() {
        System.out.println("In a computer");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("In a laptop");
    }
}

public class Polymorphism {
    void main() {
        Computer c = new Laptop();
        c.show();
    }
}
