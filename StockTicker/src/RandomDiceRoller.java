import java.util.Random;
/**
 *
 * @author jordan
 */
public class RandomDiceRoller {
    public static int[] roller(){
        int values[] = new int[7]; 
        
        Random randint = new Random();
        
        for(int i = 0; i <= 6; i++){
            values[i] = randint.nextInt(0, 200);
        }
        
        return values;
    }
}
