package clients;

import java.time.LocalDate;

public class Ostrich extends Animal{
    public Ostrich(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Ostrich() {
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

