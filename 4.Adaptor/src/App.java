import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("댕댕"));
        animals.add(new Cat("송털"));
        animals.add(new Cat("츄츄츄츄츄"));
        // adopter가 없을 때, 에러
        // animals.add(new Tiger("타이온"));
        animals.add(new TigerAdapter("쿠르르"));

        animals.forEach(animal -> {
            animal.sound();
        });

    }
}
