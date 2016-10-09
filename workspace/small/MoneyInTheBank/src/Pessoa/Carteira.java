package Pessoa;

/**
 * Created by codecadet on 04/10/16.
 */
public class Carteira {

    private int moneyWallet;



    public Carteira (int moneyWallet) {

        this.moneyWallet = moneyWallet;
    }



    public void receiveMoney(int amount){

        moneyWallet = moneyWallet + amount;

    }



    public void letGoMoney (int amount){

        if(moneyWallet < amount){

            System.out.println("YOU'RE STIFF GIRL");
            return;
        }
        moneyWallet =  moneyWallet - amount;

    }

    public int getMoneyWallet(){

        return moneyWallet;
    }
}