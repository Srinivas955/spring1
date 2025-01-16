package in.koost;

public class Laptop implements Computer {

   /* public Laptop(){
        System.out.println("Laptop Constructor");
    }*/

    @Override
    public void compile() {
        System.out.println("Laptop compile");
    }
}
