package XMLConfiguration;

public class Calculator {
    private int a;
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
