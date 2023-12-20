package practice.machine;

public interface Machine {
    int getMoney();

    int getQuantity();

    void sell(int money);

    void make(int quantity);
}
