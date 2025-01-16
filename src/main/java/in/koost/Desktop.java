package in.koost;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop constructor");
    }
    @Override
    public void compile() {
        System.out.println("Compile desktop");
    }
}
