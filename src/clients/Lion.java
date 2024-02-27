package clients;

import java.time.LocalDate;

public class Lion extends Animal {

    public Lion(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Lion() {
        super();
    }

    @Override
    public void fly() {
        System.out.println(getType() + " doesn't fly");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " doesn't swim");
    }
}
