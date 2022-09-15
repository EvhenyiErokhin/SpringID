package XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCalculatorXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);
        calculator.result();
        context.close();
    }
}