package clients;

import java.time.LocalDate;

public class Dug extends Animal{
    public Dug(String name, float weight, LocalDate dob, Owner owner) {
        super(name, weight, dob, owner);
    }

    public Dug() {
    }
}
