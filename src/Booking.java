import java.time.LocalDate;

public class Booking {              //rezervace

    private LocalDate reservationOn;	//datum rezervace od
    private LocalDate reservationOff; 	//datum rezervace do
    private Customer customer1;          //3 zákazníci kvůli konstruktoru
    private Customer customer2;
    private Customer customer3;
    private Room room;


    // metody



    public LocalDate getReservationOn() {
        return reservationOn;
    }

    public void setReservationOn(LocalDate reservationOn) {
        this.reservationOn = reservationOn;
    }

    public LocalDate getReservationOff() {
        return reservationOff;
    }

    public void setReservationOff(LocalDate reservationOff) {
        this.reservationOff = reservationOff;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }

    public Customer getCustomer2() {
        return customer2;
    }

    public void setCustomer2(Customer customer2) {
        this.customer2 = customer2;
    }

    public Customer getCustomer3() {
        return customer3;
    }

    public void setCustomer3(Customer customer3) {
        this.customer3 = customer3;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    // konstruktor


    public Booking(LocalDate reservationOn, LocalDate reservationOff,
                   Customer customer1, Customer customer2, Customer customer3, Room room) {
        this.reservationOn = reservationOn;
        this.reservationOff = reservationOff;
        this.customer1 = customer1;
        this.customer2 = customer2;
        this.customer3 = customer3;
        this.room = room;

    }

    public Booking(LocalDate reservationOn, LocalDate reservationOff, Customer customer1,
                   Customer customer2, Room room) {
        this.reservationOn = reservationOn;
        this.reservationOff = reservationOff;
        this.customer1 = customer1;
        this.customer2 = customer2;
        this.room = room;
        this.customer3 = getCustomer3();
    }

    public Booking(LocalDate reservationOn, LocalDate reservationOff, Customer customer1, Room room) {
        this.reservationOn = reservationOn;
        this.reservationOff = reservationOff;
        this.customer1 = customer1;
        this.room = room;
        this.customer2 = getCustomer2();
        this.customer3 = getCustomer3();
    }
}
