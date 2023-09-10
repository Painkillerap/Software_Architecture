package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Abstractions.ItemGenerator;
import Rewards.Gems.GemsGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        List<String> history = new ArrayList<>();

        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new GemsGenerator());

        Scanner scanner = new Scanner(System.in);
        String answer = "y";

        while (answer.equals("y")) {
            System.out.println("===================");
            System.out.println("Открыть сундук? (y/n)");
            answer = scanner.nextLine();

            if (answer.equals("y")) {
                ItemGenerator myGenerator = generatorList.get(new Random().nextInt(generatorList.size()));
                String reward = myGenerator.openReward();
                System.out.println();
                history.add(reward);
                
                System.out.println("Последние открытые сундуки принесли вам:");
                for (int i = Math.max(0, history.size() - 5); i < history.size(); i++) {
                    System.out.println(history.get(i));                
                }
            }
        }
    }
}