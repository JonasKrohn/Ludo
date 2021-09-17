import java.util.Random;

public class Dice{
    
    static int[] sides = {1,2,3,4,5,6};
    
    public Dice(){
    }

    public static int roll(){
        int rnd = new Random().nextInt(sides.length);
        return sides[rnd];
    }
}