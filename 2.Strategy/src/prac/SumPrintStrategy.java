package prac;

public abstract class SumPrintStrategy {

    protected int num1;
    protected int num2;

    public SumPrintStrategy(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract int Sum(int num1, int num2);

    abstract void print();
}
