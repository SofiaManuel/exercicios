package org.academiadecodigo.genie;

/**
 * Created by codecadet on 07/10/16.
 */
public class Genie {

    private int maxNumberOfWishes;
    private int numberWishesGranted;


    public Genie(int maxNumberOfWishes) {

        this.maxNumberOfWishes = 2;
        this.numberWishesGranted = 0;
    }

    public void makeAWish() {

        if (maxNumberOfWishes > numberWishesGranted) {
            System.out.println("wishhh piuuuuu");

            numberWishesGranted++;

        } else {

            System.out.println("Caguei pa ti, nao há mais desejos... ANDOR");

        }

    }

    public int getMaxNumberOfWishes() {

        return maxNumberOfWishes;

    }

    public int getNumberWishesGranted() {

        return this.numberWishesGranted;

    }

    public void setMaxNumberOfWishes() {

        this.maxNumberOfWishes = 0;

    }

    public void setNumberWishesGranted(){

        this.numberWishesGranted++;

    }

}



