package clients;

import java.time.LocalDate;

public class Shark extends Animal{
    public Shark(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Shark() {
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " doesn't walk");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " doesn't fly");
    }
}
