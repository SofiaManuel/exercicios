/**
 * Created by codecadet on 02/10/16.
 */
public class MyGame {

    //private int numberFifs;
private int computerChoice;

    public void startGame(Player jogador) {

        chooseNumber();
        compare(jogador);

    }

    private void chooseNumber(){

        computerChoice = RandomNumber.randomChoice(2, 10);

        System.out.println("The number chosen by aunty Fifi is " + computerChoice);
    }


    //private void compare (int computerChoice, Player jogador) {
    private void compare (Player jogador) {

        while (computerChoice != jogador.escolhaJogador()){

          jogador.newNumber();

            System.out.println("O número agora é " + jogador.escolhaJogador() );

    }
        System.out.println("O jogador acertou");

    }



}


