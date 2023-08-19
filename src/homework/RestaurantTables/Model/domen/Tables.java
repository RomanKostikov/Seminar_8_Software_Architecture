package homework.RestaurantTables.Model.domen;

public class Tables {
    private int numberOfHall;
    private int seat;
    private boolean status;

    public Tables(int numberOfHall, int seat, boolean status) {
        this.numberOfHall = numberOfHall;
        this.seat = seat;
        this.status = status;
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
