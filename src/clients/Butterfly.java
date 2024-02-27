package clients;

import java.time.LocalDate;

public class Butterfly extends Animal{
    public Butterfly(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Butterfly() {
        super();
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " doesn't walk");;
    }

    @Override
    public void swim() {
        System.out.println(getType() + " doesn't swim");
    }
}
