package in.koost;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Laptop compile");
    }
}
