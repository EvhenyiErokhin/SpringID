package AnnotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCalculatorAnnotation {
    public static void main(String[] args) {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("AnnotationConfiguration");

        Calculator calculator = (Calculator) applicationContext.getBean("calculator");

        System.out.println(calculator.result(5, 3));
        System.out.println(calculator.result(3, 5));

    }
}
