package sda.design.patterns.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppDogsCats {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        dogs.addAll(cats.stream().map(x -> new CatToDogAdapter(x)).collect(Collectors.toList()));

        for (Dog dog : dogs) {
            System.out.println(dog.woof());
        }

    }
}
