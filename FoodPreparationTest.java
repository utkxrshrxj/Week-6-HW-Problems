abstract class Food {
    // Template method
    public final void prepare() {
        wash();
        cook();
        serve();
    }

    public abstract void wash();
    public abstract void cook();
    public abstract void serve();
}

class Pizza extends Food {
    public void wash() {
        System.out.println("Washing pizza dough");
    }
    public void cook() {
        System.out.println("Baking pizza");
    }
    public void serve() {
        System.out.println("Serving pizza");
    }
}

class Soup extends Food {
    public void wash() {
        System.out.println("Washing vegetables");
    }
    public void cook() {
        System.out.println("Boiling soup");
    }
    public void serve() {
        System.out.println("Serving soup");
    }
}

public class FoodPreparationTest {
    public static void main(String[] args) {
        Food pizza = new Pizza();
        Food soup = new Soup();

        System.out.println("Preparing Pizza:");
        pizza.prepare();

        System.out.println("\nPreparing Soup:");
        soup.prepare();
    }
}
