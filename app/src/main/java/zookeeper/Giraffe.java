package zookeeper;

public class Giraffe extends Hooved {
    public Giraffe(String food, boolean nocturnal, double averageLifeSpan) {
        super(food, nocturnal, averageLifeSpan);
   }
    public void hum() {
        System.out.println("The giraffe hums.");
    }

    @Override
    public void say() {
        hum();
    }
}
