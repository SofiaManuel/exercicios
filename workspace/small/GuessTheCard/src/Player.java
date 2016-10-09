/**
 * Created by Sofia Manuel on 01/10/2016.
 */
public class Player {

    private int number;
    private String name;

    public Player (String name){
        this.name = name;


    }

    public int escolhaJogador(){

        this.number = RandomNumber.randomChoice(2,10);
        System.out.println("Player " + this.name + " chosen number " + this.number);
        return this.number;
    }

    public void newNumber() {

        this.number = RandomNumber.randomChoice(2,10);

    }

}

