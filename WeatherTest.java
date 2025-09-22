class Weather {
    String condition;

    public Weather() {
        this.condition = "General Weather";
        System.out.println("Weather constructor");
    }

    public void display() {
        System.out.println("Weather condition: " + condition);
    }
}

// Multilevel inheritance
class Storm extends Weather {
    public Storm() {
        super();
        this.condition = "Storm";
        System.out.println("Storm constructor");
    }

    @Override
    public void display() {
        System.out.println("Storm is happening!");
    }
}

class Thunderstorm extends Storm {
    public Thunderstorm() {
        super();
        this.condition = "Thunderstorm";
        System.out.println("Thunderstorm constructor");
    }

    @Override
    public void display() {
        System.out.println("Thunderstorm with lightning!");
    }
}

// Hierarchical inheritance
class Sunshine extends Weather {
    public Sunshine() {
        super();
        this.condition = "Sunshine";
        System.out.println("Sunshine constructor");
    }

    @Override
    public void display() {
        System.out.println("Sun is shining!");
    }
}

public class WeatherTest {
    public static void main(String[] args) {
        Weather[] weathers = {new Weather(), new Storm(), new Thunderstorm(), new Sunshine()};

        for (Weather w : weathers) {
            w.display();
        }
    }
}
