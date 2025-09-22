class BasicMath {
    public int calculate(int a, int b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedMath extends BasicMath {
    public int calculate(int a) {
        return a * a;
    }

    public double calculate(double a, double b) {
        return a / b;
    }
}

public class MathOperationsTest {
    public static void main(String[] args) {
        BasicMath bm = new BasicMath();
        AdvancedMath am = new AdvancedMath();

        System.out.println("BasicMath calculate(5, 10): " + bm.calculate(5, 10));
        System.out.println("BasicMath calculate(5, 10, 15): " + bm.calculate(5, 10, 15));
        System.out.println("AdvancedMath calculate(5): " + am.calculate(5));
        System.out.println("AdvancedMath calculate(10.0, 2.0): " + am.calculate(10.0, 2.0));
    }
}
