package Pessoa;

/**
 * Created by codecadet on 04/10/16.
 */
public class PiggyBank {

    private int savings;

    public PiggyBank(int savings){
        this.savings = savings;

    }

    public void receiveMoney (int amount){

        savings = savings + amount;

    }

    public void letGoMoney (int amount){

        savings = savings - amount;

    }

    public int getSavings(){

        return savings;
    }

}
