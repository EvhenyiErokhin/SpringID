package AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calculator")
public class Calculator {

    private final MinusService minusService;
    private final PlusService plusService;

    @Autowired
    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }

    public int result(int a, int b) {
        if (a < b) {
            return plusService.plusServ(a, b);
        } else {
            return minusService.minusServ(a, b);
        }
    }

}
