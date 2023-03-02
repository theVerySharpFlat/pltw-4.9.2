package zookeeper;

public class Elephant extends Animal {
    public Elephant(String food, boolean nocturnal, double avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
        System.out.println("creating an elephant!");
    }

    public Elephant() {
        super("", false, 0.0);
    }

    public void trumpet() {
        System.out.println("The elephant trumpets!");
    }

    @Override
    public void say() {
        trumpet();
    }
}
