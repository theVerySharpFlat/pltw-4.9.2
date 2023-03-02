package zookeeper;

public class Hooved extends Animal {
    public Hooved(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
    }

    public void forage() {
        System.out.println("The hooved animal forages for food.");
    }

    @Override
    public void say() {
        forage();
    }
}
