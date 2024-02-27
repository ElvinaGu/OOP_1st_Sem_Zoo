package clients;

import java.time.LocalDate;

public class Crocodile extends Animal {
    public Crocodile(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Crocodile() {
    }

    @Override
    public void fly() {
        System.out.println(getType() + " doesn't fly");
    }
}
