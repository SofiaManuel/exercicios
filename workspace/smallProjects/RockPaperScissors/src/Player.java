/**
 * Created by codecadet on 03/10/16.
 */
public class Player {

    private String name;
    private int wins;

    public Player (String name){
        this.name = name;
        this.wins = 0;
    }


    // aumenta as vezes que determinado jogador ganha
    public void win(){
        System.out.println(name + " WON THE ROUND UHUHUH");
        this.wins++;
    }


    // devolve o numero total de wins dos jogadores
    public int getWins(){

        return wins;
    }


    //aqui os jogadores escolhem se querem pedra papel tesoura. utilizando o ".values" transforma num array
    // e mostram a sua escolha

    public Hand chooseHand() {
        int number = RandomObject.generateNumber(2);

        Hand[] arrayOptions = Hand.values();

        Hand option = arrayOptions[number];

        return option;
    }


    public String getName() {
        return name;
    }
}






