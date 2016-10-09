package org.academiadecodigo.genie;

/**
 * Created by codecadet on 07/10/16.
 */
public class MagicLamp {

    private int maxGenies;
    private int generatedGenies;
    private Genie[] genies;

    public MagicLamp(int maxGenies) {

        //this.maxGenies = RandomNumber.generateNumberBetween(1, 5);
        this.maxGenies = maxGenies;
        generatedGenies = 0;
        this.genies = new Genie[maxGenies + 1];


    }

    public void rubbingLamp() {

        for (int i = 0; i < genies.length; i++) {

            if (maxGenies == generatedGenies) {

                RecyclableDemon recyclableDemon = new RecyclableDemon(10);

                genies[i] = recyclableDemon;

                generatedGenies++;

            } else if (generatedGenies < maxGenies && i % 2 == 0) {

                FriendlyGenie friendlyGenie = new FriendlyGenie(10);

                genies[i] = friendlyGenie;

                generatedGenies++;


            } else if (generatedGenies < maxGenies) {

                GrumpyGenie grumpyGenie = new GrumpyGenie(10);

                genies[i] = grumpyGenie;

                generatedGenies++;

            } else {

                System.out.println("teste");

            }
        }
    }


    public void recycle(Genie genie) {

        if (genie instanceof RecyclableDemon) {

            generatedGenies = 0;

            genie.setMaxNumberOfWishes();

            System.out.println("Recycled");


        } else {

            System.out.println("Not a Demon");
        }

    }

    public Genie[] getGenies() {
        return genies;
    }

    public void compare(MagicLamp lampToCompare) {

        if (maxGenies == lampToCompare.maxGenies) {

        }

    }
}







