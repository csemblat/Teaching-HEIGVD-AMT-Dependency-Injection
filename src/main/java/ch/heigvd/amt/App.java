package ch.heigvd.amt;

import ch.heigvd.amt.fishing.Fish;
import ch.heigvd.amt.fishing.Fisherman;
import ch.heigvd.amt.fishing.God;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        God god = new God();
        Fisherman fisherman = god.CreateWorld();
        Fish meal = fisherman.goGetFish();
        meal.eat();
    }
}
