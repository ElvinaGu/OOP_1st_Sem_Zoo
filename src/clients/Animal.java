package clients;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate dob;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate dob, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.dob = dob;
        this.owner = owner;
    }
    public Animal() {
        this("Животное", 50, LocalDate.now(), new Owner());
    }
    private void sleep(){
        System.out.println(getType() + " sleep");
    }
    private void wakeUp(){
        System.out.println(getType() + " wake up");
    }
    private void wakeUp(int time){
        System.out.println(getType() + " wake up in " + time);
    }
    private void eat(){
        System.out.println(getType() + " eat");
    }
    private void play(){
        System.out.println(getType() + " play");
    }

    public void toGo(){
        System.out.println(getType() + " to go");
    }
    public void fly(){
        System.out.println(getType() + " fly");
    }
    public void swim(){
        System.out.println(getType() + " swim");
    }

    public void lifeCycle(){
        wakeUp(06);
        eat();
        play();
        sleep();
    }
    public String getType(){
        return getClass().getSimpleName();
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Owner getOwner() {
        return owner;
    }

    public String toString(){
        return String.format("name = %s, weight = %s, dob = %s, owner = %s", name, weight, dob, owner);
    }
}
