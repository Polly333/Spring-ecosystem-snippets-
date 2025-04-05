package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //loading Spring Context from xml config file
        // ApplicationContext -> Interface , ClassPathXmlApplicationContext -> implementation
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        //spring gives the object , no need of new keyword
        Mybean beanny1 = (Mybean)context.getBean("beanIdentifier"); // can do this too

        Mybean beanny2 = context.getBean(Mybean.class);

        System.out.println(beanny1); // the toString() in Mybean.class invoked
        System.out.println(beanny2);

        //System.out.println(beanny2.showMessage()); //wrong way to write , it should return something to use it like that

        beanny2.showMessage(); // spring context uses the setter

    }
}
