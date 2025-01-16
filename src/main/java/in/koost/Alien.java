package in.koost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component("alienapplication")
public class Alien {

    private int age;
    //private Laptop laptop;

  /*  @Autowired
    @Qualifier("laptop")*/
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

    @Autowired
    @Qualifier("desktop") //when we give both annotations here Qualifier with one class and at another class
                          //we are giving primary annotation then Qualifier one will execute
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Alien");
        computer.compile();
    }

}


