/**
 * Created by codecadet on 03/10/16.
 */
public class Game {

    private int round = 0;


    public void startGame(Player p1, Player p2, int numberOfRounds) {

        while (round < numberOfRounds) {

            Player winner;

            // pedir a mao aos jogadores
            Hand p1Hand = p1.chooseHand();
            Hand p2Hand = p2.chooseHand();

            winner = p1;

            // considerar todas as hipotses onde o jogador 2 é vencedor
            if (p1Hand.equals(Hand.ROCK) && p2Hand.equals(Hand.PAPER) ||
                    p1Hand.equals(Hand.PAPER) && p2Hand.equals(Hand.SCISSORS) ||
                    p1Hand.equals(Hand.SCISSORS) && p2Hand.equals(Hand.ROCK)) {

                winner = p2;
            }

            if (p1Hand.equals(p2Hand)) {
                System.out.println("It was a tie... replaying this round");
                break;
            }

            // aqui vao ser incrementadas as vitorias consuante ganhe o p1 ou o p2;
            winner.win();
            // aumenta a ronda
            this.round++;
        }


        if (p1.getWins() > p2.getWins()) {
            printameIsto(p1.getName() + " ganhou! UHUH");
        } else {
            printameIsto(p2.getName() + " ganhou! UHUH");
        }

    }

    public void printameIsto(String str) {
        System.out.println(str);
    }


}
