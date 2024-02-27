package clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Dog() {
    }

    @Override
    public void fly() {
        System.out.println(getType() + " doesn't fly");
    }
}
