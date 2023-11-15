package prac;

import java.util.Random;

public class DiceGetNumber implements NumberStrategy {

    @Override
    public int getNumb() {
        Random ran = new Random();
        int num = ran.nextInt(6);
        System.out.println("DiceGetPrinter : " + num);
        return num;
    }

}
