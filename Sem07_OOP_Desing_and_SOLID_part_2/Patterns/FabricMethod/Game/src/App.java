import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.ItemGenerator;
import Fabric.GemGeneretor;
import Fabric.GoldGeneretor;

public class App {
    public static void main(String[] args) throws Exception {

        Random rnd = ThreadLocalRandom.current();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGeneretor());
        generatorList.add(new GemGeneretor());

        for (int i = 0; i < 10; i++) 
        {
            int index =rnd.nextInt(2);
            generatorList.get(index).openReward();
        }

    }
}
