package Rewards.Gems;

import Abstractions.IGameItem;
import java.util.Random;

public class GemsRewards implements IGameItem{

    private static final String[] GEMS = {"Ruby!", "Diamond!", "Sapphire!", "Topaz!", "Amethyst!"};
    private static final Random RANDOM = new Random();

    @Override
    public String open() {
        return GEMS[RANDOM.nextInt(GEMS.length)];
    }
    
}