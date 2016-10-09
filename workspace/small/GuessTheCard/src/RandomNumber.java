/**
 * Created by Sofia Manuel on 01/10/2016.
 */
public class RandomNumber {

//
    public static int randomChoice(int min, int max) {

       int randomChoice = (int) (Math.random() * (max - min)) + min;

        return randomChoice;

    }
}




















