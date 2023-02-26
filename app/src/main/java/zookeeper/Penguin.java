package zookeeper;

public class Penguin extends Animal {
    public Penguin() {
        super("", false, 0.0);
    }

    public Penguin(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
    }

    public void swim() {
        System.out.println("the penguin swims");
    }

    public void fish() {
        System.out.println("the penguin fishes");
    }
}
