package in.koost.appconfig;

import in.koost.Alien;
import in.koost.Computer;
import in.koost.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //@Bean(name ="desktop")
   // @Bean(name={"desktop", "beast"})
    @Bean
    @Scope(value = "prototype")
    public Desktop desktop(){ //by default method name is bean name
        return new Desktop();
    }

    @Bean
    public Alien alien(@Autowired Computer comp){ //we are creating a wire between an Alien and desktop object
                                                    // Computer is an interface and desktop its implementation
                                                    //class
        Alien alien = new Alien();
        alien.setAge(33);
        //alien.setComputer(desktop()); //which is tightly coupled
        alien.setComputer(comp);

        return alien;


    }
}
