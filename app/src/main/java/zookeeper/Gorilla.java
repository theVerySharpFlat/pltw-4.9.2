package zookeeper;

public class Gorilla extends Primate {
    public Gorilla() {
        System.out.println("creating a gorilla");
    }

    public void grunt() {
        System.out.println("The gorilla grunts.");
    }

    @Override
    public void say() {
        grunt();
    }
}
