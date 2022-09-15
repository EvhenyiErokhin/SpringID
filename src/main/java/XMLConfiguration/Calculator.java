package XMLConfiguration;

public class Calculator {

    private final MinusService minusService;
    private final PlusService plusService;
    private int a;
    private int b;

    public Calculator(MinusService minusService, PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }

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