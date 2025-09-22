import java.util.Objects;

class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Game)) return false;
        Game other = (Game) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class CardGame extends Game {
    private int numberOfCards;

    public CardGame(String name, int numberOfCards) {
        super(name);
        this.numberOfCards = numberOfCards;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cards: " + numberOfCards;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof CardGame)) return false;
        CardGame other = (CardGame) obj;
        return numberOfCards == other.numberOfCards;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfCards);
    }
}

public class CardGameTest {
    public static void main(String[] args) {
        Game game1 = new Game("Chess");
        Game game2 = new Game("Chess");
        CardGame cardGame1 = new CardGame("Poker", 52);
        CardGame cardGame2 = new CardGame("Poker", 52);

        System.out.println(game1);
        System.out.println(cardGame1);
        System.out.println("game1 equals game2? " + game1.equals(game2));
        System.out.println("cardGame1 equals cardGame2? " + cardGame1.equals(cardGame2));
    }
}
