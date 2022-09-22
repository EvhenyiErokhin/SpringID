package XMLConfiguration;

public class Calculator {

    private final MinusService minusService;
    private final PlusService plusService;
    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }


    public int result(int a, int b) {
        if (a < b) {
            return plusService.servicePlus(a,b);
        } else {
            return minusService.serviceMinus(a,b);        }
    }
}