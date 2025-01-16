package in.koost.appconfig;

import in.koost.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //@Bean(name ="desktop")
   // @Bean(name={"desktop", "beast"})
    @Bean
    public Desktop desktop(){ //by default method name is bean name
        return new Desktop();
    }
}
