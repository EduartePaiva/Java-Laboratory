public class RecordClassLesson {
    record Alien(int id, String name) {

        public Alien {
            if (id == 0)
                throw new IllegalArgumentException("id cannot be zero");
        }

    }

    void main() {
        Alien a1 = new Alien(1, "Ed");
        Alien a2 = new Alien(1, "Edu");
        Alien a3 = new Alien(0, "Edu");

        System.out.println(a1.equals(a2));
        System.out.println(a1);
    }
}
