public class MultiCalc extends SimpleCalc {
    public void calculate() {
        value -= 3;
    }
    public void calculate(int multiplier) {
        calculate();
        super.calculate();
        value *= multiplier;
    }
    public static void main(String[] args) {
        MultiCalc calculator = new MultiCalc();
        SimpleCalc sc = new SimpleCalc();
        System.out.println("sc Value is : " + sc.value);
        // System.out.println("Value is : " + calculator.value);
        calculator.calculate(2);
        System.out.println("Value is : " + calculator.value);
    }
}
