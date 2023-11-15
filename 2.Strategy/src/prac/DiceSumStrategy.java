package prac;

public class DiceSumStrategy extends SumPrintStrategy {

    private int num1;
    private int num2;
    private int sum;

    public DiceSumStrategy(int num1, int num2) {
        super(num1, num2);
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    int Sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    void print() {
        System.out.println("Sum to Dice : " + Sum(num1, num2));
    }

}
