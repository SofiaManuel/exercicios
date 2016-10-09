package Pessoa;

/**
 * Created by codecadet on 04/10/16.
 */
public class MulherDaBida {

      private String name;
      private int exHusbandPension;
      private int salary;

      public MulherDaBida(String name) {
            this.name = name;
            this.exHusbandPension = 1000;
            this.salary = 1;
      }

      public void Save(int money, Carteira wallet, PiggyBank bank) {


            wallet.letGoMoney(money);
            bank.receiveMoney(money);

            System.out.println("In my wallet I have " + wallet.getMoneyWallet());
            System.out.println("Now I have " + bank.getSavings() + " in savings");

      }

      public void toBeAGoldDigger(PiggyBank bank) {

            bank.receiveMoney(exHusbandPension);

            System.out.println("Super Upper Dupper RICH! " + bank.getSavings() + " in my bank!");

      }

      public void workLikeABoss(Carteira wallet) {

            int number = RandomObject.generateNumberBetween(1, 10);

            wallet.receiveMoney(salary * number);

            System.out.println("Jesus, " + number + " in just onde day? At least I have " +
                                    wallet.getMoneyWallet() + " in my pocket" );


      }

      public void transferMoney(Carteira wallet, PiggyBank bank) {

            if (wallet.getMoneyWallet() < exHusbandPension/10){
                  bank.letGoMoney(exHusbandPension/10);
                  wallet.receiveMoney(exHusbandPension/10);
                  System.out.println("I had so little in my wallet that I had to take money " +
                          "from my bank account... Thank god for my ex");
                  System.out.println("I have " + wallet.getMoneyWallet() + " euros in my wallet");
            }

      }

}
