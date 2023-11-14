package test;

import java.util.ArrayList;

public class IteratorDeposit {
    private ArrayList<Deposit> data;

    private int index;

    public IteratorDeposit(ArrayList<Deposit> data) {
        this.data = data;
        this.index = -1;
    }

    public boolean next() {
        this.index++;
        return data.size() > index;
    }
    
    public Deposit getDeposit() {
        return data.get(this.index);
    }
    
}
