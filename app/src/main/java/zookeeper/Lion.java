package zookeeper;

public class Lion extends Feline {
    public Lion(String food, boolean nocturnal, double avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
    }

    public void huntInPack() {
        System.out.println("The lion hunts in a pack!");
    }

    public void roar() {
        System.out.println("The lion roars");
    }

    @Override
    public void say() {
        roar();
   }
}
