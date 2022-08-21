package AnnotationConfiguration;

import JavaConfiguration.MinusService;
import JavaConfiguration.PlusService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

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
    public void result(){
        if(a < b){
            System.out.println(PlusService.servicePlus(getA(), getB()));
        }
        else {
            System.out.println(MinusService.serviceMinus(getA(), getB()));
        }
    }
}
