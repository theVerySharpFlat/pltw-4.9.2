package zookeeper;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();

        elephant.getLifeSpan();

        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();

        Penguin penguin = new Penguin();
        penguin.fish();
        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(giraffe);
        animals.add(penguin);
        animals.add(owl);

        for (Animal animal : animals) {
            hearTheAnimal(animal);
        }
    }

    public static void hearTheAnimal(Animal a) {
        a.say();
    }
}
