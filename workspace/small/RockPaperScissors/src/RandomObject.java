 /**
 * Created by codecadet on 03/10/16.
 */
public class RandomObject {

        //
        public static int generateNumber(int max) {

            /*
            int randomChoice = (int) ((Math.random() * (max + 1)));

            return randomChoice;

            ou podemos ser ultra resumidos!
             */
            //esta está a chamar a generateNumberBetween passando-lhe o primeiro argumento a 0;

            return generateNumberBetween(0, max);

        }



         public static int generateNumberBetween(int min, int max) {

           /* int randomChoice;

             randomChoice = (int) (Math.random() * (max - min)) + min;

            return randomChoice;

            ou podemos ser ultra resumidos!

            */

             return (int) (Math.random() * (max - min) + min);

         }

    }

