package in.koost.appconfig;

import in.koost.Desktop;
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
}
