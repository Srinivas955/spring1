package in.koost;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    //private Laptop laptop;
    private Computer computer;

   /* @ConstructorProperties({"age", "laptop"})
    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }*/

   /* public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Alien");
        computer.compile();
    }

}


