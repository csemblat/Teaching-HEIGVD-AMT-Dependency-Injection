package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.Bait;
import ch.heigvd.amt.fishing.equipment.Boat;
import ch.heigvd.amt.fishing.equipment.Boots;
import ch.heigvd.amt.fishing.equipment.FishingRod;

public class Fisherman {

  private Boots boots;
  private FishingRod fishingRod;
  private Bait bait;
  private Boat boat;

  public Boots getBoots() {
    return boots;
  }

  public void setBoots(Boots boots) {
    this.boots = boots;
  }

  public FishingRod getFishingRod() {
    return fishingRod;
  }

  public void setFishingRod(FishingRod fishingRod) {
    this.fishingRod = fishingRod;
  }

  public Bait getBait() {
    return bait;
  }

  public void setBait(Bait bait) {
    this.bait = bait;
  }

  public Boat getBoat() {
    return boat;
  }

  public void setBoat(Boat boat) {
    this.boat = boat;
  }

  public Fisherman(){

  }
  public Fisherman(Boat boat, Boots boots, FishingRod fishingRod, Bait bait){
    this.boat = boat;
    this.boots = boots;
    this.fishingRod = fishingRod;
    this.bait = bait;
  }

  public Fish goGetFish() {
    getBoots().wear();
    getBoat().putOnWater();
    getBoat().startEngine();
    getBait().putOnHook();
    getFishingRod().moveUpTheAir();
    Fish fish = getFishingRod().pullOutOfWater();
    return fish;
  }

}
