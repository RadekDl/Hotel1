import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Adéla ","Malíková ",LocalDate.of(
                1993,3,13));
        Customer customer2 = new Customer("Jan ", "Dvořáček ", LocalDate.of(
                1995,5,5));
        Customer customer3 = new Customer("Null","Null",LocalDate.of(
                1900,1,1));

        customer2.setBirthday(LocalDate.of(1995,4,5));
       // System.out.println(customer2.getBirthday());  // kontrola přepsání datumu

        Room room1 = new Room(1,1,true,
                true,1000);
        Room room2 = new Room(2,1,true,
                true, 1000);
        Room room3 = new Room(3, 3, false,
                true,2400);

        Stay isWorkStay1 = new Stay(true);
        Stay isWorkStay2 = new Stay(false);


        System.out.println("\n"+ customer1.getFirstName()+" "+ customer1.getSecondName()+ " "+
                            customer1.getBirthday());
        System.out.println("\n"+ customer2.getFirstName()+" "+ customer2.getSecondName()+ " "+
                            customer2.getBirthday());


        System.out.println("\nPokoj číslo "+room1.getRoomOfNumber()+ " a pokoj číslo "+
                            room2.getRoomOfNumber()+ " jsou "+ room1.getNumberOfBeds()+ " lůžkové "+
                            " za cenu "+ room1.getPrice()+"Kč/noc." +"\n Další vybavení: balkón: "+
                            room1.getIsBalcon()+","+" Výhled na moře: "+room1.getIsSeaView()+".");
        System.out.println("\nPokoj číslo "+room3.getNumberOfBeds()+" je "+ room1.getNumberOfBeds()+"lůžkový"+
                            " za cenu "+ room3.getPrice()+"Kč/noc."+"\n Další vybavení: balkón: "+ room3.getIsBalcon()+
                            " Výhled na moře: "+ room3.getIsSeaView());

        Booking booking1 = new Booking(LocalDate.of(2021,7,1),
                                        LocalDate.of(2021,7,19), customer1,room1); //


        Booking booking2 = new Booking (LocalDate.of(2021,9,1),
                                         LocalDate.of(2021,9,14), customer1,
                customer2,room3);



        System.out.println("\n Rezervace pokoje číslo "+room1.getRoomOfNumber()+" je "+ "od "
                            +booking1.getReservationOn()+" do "+booking1.getReservationOff()+" klientem "
                                + booking1.getCustomer1().getFirstName()+" "+ booking1.getCustomer1().getSecondName()
                                +" pracovní pobyt "+ isWorkStay1.getIsWorkStay()+"\n");

        System.out.println("Rezervace pokoje číslo "+room3.getRoomOfNumber()+" je "+ "od "
                +booking2.getReservationOn()+" do "+booking2.getReservationOff()+" klientem "
                + booking2.getCustomer1().getFirstName()+" "+ booking2.getCustomer1().getSecondName()
                +" "+booking2.getCustomer2().getFirstName()+ " a "+booking2.getCustomer2().getSecondName()
                +" pracovní pobyt "+ isWorkStay2.getIsWorkStay());                    ;


       List<Booking> bookings = new ArrayList<>();
       bookings.add(booking1);
       bookings.add(booking2);


        for (Booking reservation : bookings ) {
            System.out.println("\nzačátek rezervace "+ reservation.getReservationOn());
            System.out.println("konec rezervace "+ reservation.getReservationOff());
            System.out.println("pokoj číslo "+ reservation.getRoom().getRoomOfNumber()+"\n");
            //System.out.println("jméno "+ reservation.getCustomer()); // nenačítá mi to get.customer

        }



    }
}