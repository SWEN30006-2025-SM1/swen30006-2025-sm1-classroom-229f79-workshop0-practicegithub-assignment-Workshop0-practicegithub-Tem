package example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new RuntimeException("Divide by zero");
        return (double) a / (double) b;
    }
}
