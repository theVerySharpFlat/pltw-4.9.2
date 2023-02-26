package zookeeper;

public class Feline extends Animal {
    public Feline(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
        System.out.println("creating a Feline");
    }
}
