package JavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCalculatorJava {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                ConfigurationJava.class);
        Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
        calculator.result();

    }
}