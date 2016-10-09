/**
 * Created by codecadet on 05/10/16.
 */
public class Main {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Pirata", 10, 40);

        Clients client1 = new Clients("Marlene");
        Clients client2 = new Clients("Fofa");


        client1.checkIn(hotel1);
        //client1.checkOut();
        System.out.println(client1.toString());

        client2.checkIn(hotel1);
        //client2.checkOut();
        System.out.println(client2.toString());




    }
}
