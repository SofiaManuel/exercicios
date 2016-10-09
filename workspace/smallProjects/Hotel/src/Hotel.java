import java.util.Arrays;

/**
 * Created by codecadet on 05/10/16.
 */
public class Hotel {

    private String name;
    private Rooms[] rooms;

    public Hotel(String name, int numOfRooms, int pricePerRoom) {
        this.name = name;
        this.rooms = new Rooms[numOfRooms];

        for (int i = 0; i < rooms.length; i++) {

            if (i % 2 == 0) {
                rooms[i] = new Rooms(pricePerRoom * 2);

            } else {
                rooms[i] = new Rooms(pricePerRoom);

            }
        }
    }

    public int checkNextAvailableRoom() {
        int toReturn = -1;
        for (int i = 0; i < rooms.length; i++) {
            /*ao percorrer o array se o hotel encontrar
            um quarto livre vai atribuir
            o quarto ao cliente*/

            if (rooms[i].getVacantRoom()) {
                //atenção ao return
                toReturn = i + 1;
                /*automaticamente muda a avaliabilidade
                para OCUPADO*/
                rooms[i].setAvailability();
                break;
            }
        }
        //se nao encontrar um quarto livre AZAR!
        if (toReturn == -1) {
            System.out.println("No room for you");
        }
        return toReturn;
    }


    public int checkOut(int myRoomNumber) {
    /*vamos voltar a mudar a nossa avaliabilidade
    para livre após o cliente pedir checkout*/
        rooms[myRoomNumber - 1].setAvailability();
        return -1;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}

