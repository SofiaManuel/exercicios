/**
 * Created by codecadet on 03/10/16.
 */
public class Main {
    public static void main(String[] args) {


        Player P1 = new Player("THE LIGHTNING THAT CRACKS YOU");
        Player P2 = new Player("DON'T CHECK THE OFFERED HORSE TOOTH");

       Game G1 = new Game();
        G1.startGame(P1, P2, 3);

    }


