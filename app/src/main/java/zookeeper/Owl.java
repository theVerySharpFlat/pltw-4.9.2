package zookeeper;

public class Owl extends Animal {
    public Owl() {
        super("", false, 0.0);
    }

    public Owl(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
    }

    public void hunt() {
        System.out.println("the owl hunts");
    }
}
