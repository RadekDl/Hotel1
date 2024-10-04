import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Karel ","Vála ", LocalDate.of(
                1975, 1,1));

        Customer customer2 = new Customer("Jana ", "Nováková ", LocalDate.of(
                1985,7,6));

        Room room1 = new Room(1,4,true,
                true,1500);

        Room room2 = new Room(2,2,false,
                true, 2000);
        Room room3 = new Room(3, 1, true,
                true,2500);



        System.out.println(customer1);
        System.out.println(customer2);


    }
}