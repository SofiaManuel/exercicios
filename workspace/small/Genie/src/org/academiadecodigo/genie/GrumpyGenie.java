package org.academiadecodigo.genie;

/**
 * Created by codecadet on 07/10/16.
 */
public class GrumpyGenie extends Genie {

    public GrumpyGenie(int maxNumberWishes){

        super(maxNumberWishes);

    }


    @Override
    public void makeAWish() {

        if (getNumberWishesGranted() == 0) {

            System.out.println("One wish for you");

            setNumberWishesGranted();


        } else {

            System.out.println("Caguei pa ti, nao há mais desejos... ANDOR");

        }
    }

    @Override
    public String toString() {
        return "GrumpyGenie";
    }
}

