package pl.edu.ur.oopl10;
import java.util.Random;
/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int counter  = 0;
        while(counter != 3) {
            int randomNum1 = -10 + rand.nextInt((10 - -10) + 1);
            int randomNum2 = -10 + rand.nextInt((10 - -10) + 1);
            if(randomNum2 == 0) {
                counter++;
                System.out.println("Dzielnie przez zero jest niemożliwe " + counter);
            } else {
              double divide = randomNum1/randomNum2; 
              System.out.println("Wynik dzielenia" + divide);
            }
        }
        if(counter == 3) {
            System.out.println("3 wystapienia");
            throw new ArithmeticException();
        }
    }
    
}
