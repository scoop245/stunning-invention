package lesson7;

public class StaticCalculator4 {
    static double firstValue;
    static double secondValue;
    static String operation;

    public StaticCalculator4(double firstValue, double secondValue, String operation) {


        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation) {
            case "*" :
                return firstValue * secondValue;
            case "/" :
                return firstValue / secondValue;
            case "+" :
                return firstValue + secondValue;
            case "-" :
                return firstValue - secondValue;
            default: return 0;
        }

    }

}
