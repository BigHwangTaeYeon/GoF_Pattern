package test;

import java.util.ArrayList;


public class ArrayDeposit {
    private ArrayList<Deposit> list = new ArrayList<Deposit>();

    public ArrayDeposit(Deposit[] list) {
        for (int i = 0; i < list.length; i++) {
            this.list.add(list[i]);
        }
    }

    public IteratorDeposit iterator() {
        return new IteratorDeposit(list);
    }
}
