package practice.factory;

import practice.machine.CarMachine;
import practice.machine.Machine;

public class MachineFactory extends Factory {

    @Override
    public Machine createMachine(String instance, int money, int quantity) {
        switch (instance) {
            case "car":
                return CarMachine.getInstance(money, quantity);
        }
        return null;
    }
    
}
