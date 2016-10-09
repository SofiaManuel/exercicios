package Pessoa;

/**
 * Created by codecadet on 04/10/16.
 */
public class Main {

    public static void main(String[] args) {

        MulherDaBida Mulher1 = new MulherDaBida("Marlene");

        Carteira cart1 = new Carteira(100);

        PiggyBank bank1 = new PiggyBank(100);

        Mulher1.Save(30, cart1, bank1);

        Mulher1.toBeAGoldDigger(bank1);

        Mulher1.workLikeABoss(cart1);

        Mulher1.transferMoney(cart1, bank1);


    }

}
