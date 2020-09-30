package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.Bait;
import ch.heigvd.amt.fishing.equipment.Boat;
import ch.heigvd.amt.fishing.equipment.Boots;
import ch.heigvd.amt.fishing.equipment.FishingRod;

public class God {
    public God(){};
    public Fisherman CreateWorld(){
        Boat boat = new Boat();
        Bait bait = new Bait();
        Boots boots = new Boots();
        FishingRod fishingRod = new FishingRod();
        Fisherman fisherman = new Fisherman(boat, boots, fishingRod, bait);
        return fisherman;
    }
}
