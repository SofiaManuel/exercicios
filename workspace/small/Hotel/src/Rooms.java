/**
 * Created by codecadet on 05/10/16.
 */
public class Rooms {

    private int roomDayCost;
    private boolean vacantRoom;

    public Rooms(int cost) {
        this.roomDayCost = cost;
        this.vacantRoom = true;

    }

    public boolean getVacantRoom() {

        return vacantRoom;
    }

    public void setAvailability() {
        vacantRoom = !vacantRoom;
    }


    @Override
    public String toString() {
        return "Rooms{" +
                ", roomDayCost=" + roomDayCost +
                ", vacantRoom=" + vacantRoom +
                '}';
    }
}

