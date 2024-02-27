package clients;

import java.time.LocalDate;

public class Falcon extends Animal{
    public Falcon(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Falcon() {
    }

    @Override
    public void swim() {
        System.out.println(getType() + " doesn't swim");
    }
}
