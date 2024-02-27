import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba", 250, LocalDate.now(), new Owner());
        Dog sharik = new Dog("Sharik", 50, LocalDate.now(), new Owner());

        Butterfly betty = new Butterfly("Betty",0.12f, LocalDate.now(), new Owner());
        Crocodile croc = new Crocodile("Croc", 600, LocalDate.of(2018, 10, 21), new Owner());
        Dug donald = new Dug("Donald", 3, LocalDate.of(2023, 2,15), new Owner());
        Falcon miguel = new Falcon("Miguel", 3.5f, LocalDate.of(2024,1,10), new Owner());
        Ostrich ivan = new Ostrich("Ivan", 80, LocalDate.of(2015,10,27), new Owner());
        Shark kakashi = new Shark("Kakashi", 750, LocalDate.of(1945,8,6 ), new Owner());

//        Lion test = new Lion();
//        System.out.println(test);
//        System.out.println(simba.getWeight());
//        simba.setWeight(210);
//        System.out.println(simba.getWeight());
//        System.out.println(simba.getType());
//        System.out.println(sharik.getType());
//        simba.lifeCycle();

        System.out.println(betty);
        System.out.println(croc);
        System.out.println(donald);
        System.out.println(miguel);
        System.out.println(ivan);
        System.out.println(kakashi);
        croc.fly();
        croc.swim();
        betty.swim();
        betty.toGo();
        kakashi.fly();

//        List<Animal> animals = new ArrayList<>();
//        animals.add(simba);
//        animals.add(sharik);
//        System.out.println(animals);
    }
}