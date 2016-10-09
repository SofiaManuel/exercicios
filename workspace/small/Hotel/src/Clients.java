/**
 * Created by codecadet on 05/10/16.
 */
public class Clients {

    private String clientName;
    private Hotel hotel;
    private int myRoomNumber;

    public Clients(String clientName) {
        this.clientName = clientName;
        this.myRoomNumber = -1;
    }

    /*o meu cliente vai perguntar ao hotel que escolheu
    se existe um quarto livre*/
    public void checkIn(Hotel hotel) {
        this.hotel = hotel;
        /*depois do hotel checar a avaliabilidade
        do quarto o cliente
        guarda o número que lhe atribuiram */
        myRoomNumber = hotel.checkNextAvailableRoom();

    }

    //o meu cliente vai pedir o checkout
    public void checkOut() {
        if (myRoomNumber != -1) {
            myRoomNumber = hotel.checkOut(myRoomNumber);
        } else {
            System.out.println("I don't have a room to checkout from");
        }
    }

    @Override
    public String toString() {
        return "Clients{" +
                "clientName='" + clientName + '\'' +
                ", hotel=" + hotel +
                ", myRoomNumber=" + myRoomNumber +
                '}';
    }
}
¢