package ch.heigvd.amt.fishing;

import static org.junit.jupiter.api.Assertions.*;

class FishermanTest {

  @org.junit.jupiter.api.Test
  void goGetFish() {
    God god = new God();
    Fisherman fisherman = god.CreateWorld();
    Fish fish = fisherman.goGetFish();
    assertNotNull(fish);
  }
}