package Rewards.Gems;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GemsGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new GemsRewards();
    }
    
}