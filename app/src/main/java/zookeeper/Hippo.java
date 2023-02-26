package zookeeper;

public class Hippo extends Hooved {
    public Hippo(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
    }

    public void groan() {
        System.out.println("The hippo groans.");
    }
}
