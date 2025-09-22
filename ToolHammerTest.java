class Tool {
    private String brand = "Generic Brand";
    protected String type = "Hand Tool";
    public int warrantyInMonths = 12;

    public String getBrand() {
        return brand;
    }
}

class Hammer extends Tool {
    public void printDetails() {
        // Cannot access brand directly because it is private
        System.out.println("Brand (access via getter): " + getBrand());
        System.out.println("Type (protected): " + type);
        System.out.println("Warranty (public): " + warrantyInMonths + " months");
    }
}

public class ToolHammerTest {
    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.printDetails();
    }
}
