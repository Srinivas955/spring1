package in.koost;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Laptop compile");
    }
}
