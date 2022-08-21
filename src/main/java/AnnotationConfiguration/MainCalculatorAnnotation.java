package AnnotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCalculatorAnnotation {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "annotationConfig.xml");
        Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
        calculator.result();

    }
}
