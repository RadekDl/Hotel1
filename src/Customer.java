import java.time.LocalDate;

public class Customer {             //zákazník

    private String firstName;
    private String secondName;
    private LocalDate birthday;


// konstruktor

    public Customer(String firstName, String secondName, LocalDate birthday) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
    }




}
