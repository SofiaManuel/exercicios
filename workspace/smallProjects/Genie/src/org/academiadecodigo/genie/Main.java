package org.academiadecodigo.genie;

/**
 * Created by codecadet on 07/10/16.
 */
public class Main {

    public static void main(String[] args) {

        MagicLamp lamp1 = new MagicLamp(4);

        MagicLamp lamp2 = new MagicLamp(3);

        lamp1.rubbingLamp();
        lamp2.rubbingLamp();

        lamp2.compare(lamp1);

      Genie[] genios = lamp1.getGenies();

        for (int i = 0; i < genios.length ; i++) {
            System.out.println(genios[i].toString());

            genios[i].makeAWish();
            genios[i].makeAWish();
            genios[i].makeAWish();
            lamp1.recycle(genios[i]);

        }

    }

}
