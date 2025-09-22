class Light {
    String type;
    int brightness;

    public Light() {
        this("Unknown", 0);
        System.out.println("Default Light constructor");
    }

    public Light(String type) {
        this(type, 0);
        System.out.println("Light constructor with type");
    }

    public Light(String type, int brightness) {
        this.type = type;
        this.brightness = brightness;
        System.out.println("Light constructor with type and brightness");
    }
}

class LED extends Light {
    String color;

    public LED() {
        this("White");
        System.out.println("Default LED constructor");
    }

    public LED(String color) {
        super("LED");
        this.color = color;
        System.out.println("LED constructor with color");
    }

    public LED(String color, int brightness) {
        super("LED", brightness);
        this.color = color;
        System.out.println("LED constructor with color and brightness");
    }
}

public class LightLEDTest {
    public static void main(String[] args) {
        LED led1 = new LED();
        LED led2 = new LED("Red");
        LED led3 = new LED("Blue", 75);
    }
}
