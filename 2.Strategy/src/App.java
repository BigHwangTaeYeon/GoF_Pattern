public class App {
    public static void main(String[] args) throws Exception {

        SumPrinter cal = new SumPrinter();
        cal.print(new SimpleSumStrategy(), 10);
        cal.print(new GaussSumStrategy(), 10);

    }
}
