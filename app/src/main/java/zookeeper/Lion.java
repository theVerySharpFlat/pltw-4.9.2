package zookeeper;

public class Lion extends Feline {
    public Lion(String food, boolean nocturnal, double avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
    }

    public void huntInPack() {
        System.out.println("The lion hunts in a pack!");
    }
}
