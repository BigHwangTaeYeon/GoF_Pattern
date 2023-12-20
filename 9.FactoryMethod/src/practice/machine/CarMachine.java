package practice.machine;

public class CarMachine implements Machine {
    private int money;
    private int quantity;

    private static CarMachine carMachine = new CarMachine();

    public static CarMachine getInstance(int money, int quantity) {
        carMachine.money = money;
        carMachine.quantity = quantity;
        return carMachine;
    }

    @Override
    public int getMoney() {
        return this.money;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void sell(int quantity) {
        this.quantity--;
    }

    @Override
    public void make(int quantity) {
        this.quantity++;
    }

}
