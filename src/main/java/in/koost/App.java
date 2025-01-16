package in.koost;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         Alien alien1 = (Alien) context.getBean("alien");
            alien1.age = 21;
        System.out.println(alien1.age);
        Alien alien2 = (Alien) context.getBean("alien");
        System.out.println(alien2.age);

        //System.out.println( "Hello World!" );
    }
}
