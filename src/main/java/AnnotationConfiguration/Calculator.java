package AnnotationConfiguration;

import JavaConfiguration.MinusService;
import JavaConfiguration.PlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final MinusService minusService;
    private final PlusService plusService;

    @Autowired
    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }

    @Value("${calculator.a}")
    private int a;
    @Value("${calculator.b}")

    private int b;


    public int getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void result() {
        if (a < b) {
            System.out.println(plusService.servicePlus(getA(), getB()));
        } else {
            System.out.println(minusService.serviceMinus(getA(), getB()));
        }
    }
}
