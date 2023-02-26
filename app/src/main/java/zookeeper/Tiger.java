package zookeeper;

public class Tiger extends Feline {
    public Tiger(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
    }

    public Tiger() {
        super("", false, 0.0);
    }

    public void huntAlone() {
        System.out.println("The tiger hunts alone");
    }

    public void swim() {
        System.out.println("The tiger swims");
    }
}
