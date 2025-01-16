package in.koost.appconfig;

import in.koost.Alien;
import in.koost.Computer;
import in.koost.Desktop;
import in.koost.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("in.koost")
public class AppConfig {


   /* @Bean
    public Alien alien(@Qualifier("laptop") Computer comp){ //to create the bean of laptop by using qualifier
                                                            //annotation when when morethan one classes
                                                            //implement the interface
        Alien alien = new Alien();
        alien.setAge(33);
        //alien.setComputer(desktop()); //which is tightly coupled
        alien.setComputer(comp);

        return alien;
    }*//*



    @Bean
    public Alien alien(@Qualifier("laptop") @Autowired Computer comp){ //we are creating a wire between an Alien and desktop object
                                                    // Computer is an interface and desktop its implementation
                                                    //class
        Alien alien = new Alien();
        alien.setAge(33);
        //alien.setComputer(desktop()); //which is tightly coupled
        alien.setComputer(comp);

        return alien;
    }

    //@Bean(name ="desktop")
    // @Bean(name={"desktop", "beast"})
    @Bean
    @Scope(value = "prototype")
    public Desktop desktop(){ //by default method name is bean name
        return new Desktop();
    }

    @Bean
    @Primary  //using primary annotation at class level to prioritize when more than one classes
             //implementing on interface
    public Laptop laptop(){
     return new Laptop();
    }*/
}
