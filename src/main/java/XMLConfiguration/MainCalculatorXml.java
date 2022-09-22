package XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCalculatorXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);

        System.out.println(calculator.result(5, 3));
        System.out.println(calculator.result(3, 5));

        context.close();
    }
}