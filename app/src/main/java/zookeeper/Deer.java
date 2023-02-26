package zookeeper;

public class Deer extends Hooved {
    public Deer(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
    }

    public void grunt() {
        System.out.println("The deer grunts.");
    }
}
