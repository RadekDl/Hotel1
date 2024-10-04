import java.time.LocalDate;

public class Booking {              //rezervace

    private LocalDate reservationOn;	//datum rezervace od
    private LocalDate reservationOff; 	//datum rezervace do

// konstruktor

    public Booking(LocalDate reservationOn, LocalDate reservationOff){
        this.reservationOn = reservationOn;
        this.reservationOff = reservationOff;
    }

}
