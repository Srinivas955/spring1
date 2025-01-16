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
         Alien alien1 = context.getBean("alien", Alien.class);
            alien1.setAge(21);
        System.out.println(alien1.getAge());
        alien1.code();

        Desktop desktop = context.getBean(Desktop.class);










       /* Alien alien2 = (Alien) context.getBean("alien");
        System.out.println(alien2.getAge());*/

        //System.out.println( "Hello World!" );
    }
}
