
public class ObjectClass {
    class Laptop {
        int price;
        String model;

        public String toString() {
            return "Hey";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + price;
            result = prime * result + ((model == null) ? 0 : model.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Laptop other = (Laptop) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (price != other.price)
                return false;
            if (model == null) {
                if (other.model != null)
                    return false;
            } else if (!model.equals(other.model))
                return false;
            return true;
        }

        private ObjectClass getEnclosingInstance() {
            return ObjectClass.this;
        }

    }

    void main() {

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj1);

        System.out.println(obj1.equals(obj2));

    }

}
