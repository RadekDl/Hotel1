import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Adéla ","Malíková ",LocalDate.of(
                1993,3,13));

        Customer customer2 = new Customer("Jan ", "Dvořáček ", LocalDate.of(
                1995,5,5));

        customer2.setBirthday(LocalDate.of(1995,4,5));

        System.out.println(customer2.getBirthday());  // kontrola přepsání datumu





        Room room1 = new Room(1,1,true,
                true,1000);
        Room room2 = new Room(2,1,true,
                true, 1000);
        Room room3 = new Room(3, 3, false,
                true,2400);




        Booking booking1 = new Booking(LocalDate.of(2024,12,18),
                                        LocalDate.of(2025,1,5));




        System.out.println(customer1.getFirstName()+" "+ customer1.getSecondName()+ " "+
                            customer1.getBirthday());
        System.out.println("Pokoj číslo "+room1.getRoomOfNumber()+ " a pokoj číslo "+
                            room2.getRoomOfNumber()+ " jsou "+ room1.getNumberOfBeds()+ " lůžkové "+
                            " za cenu "+ room1.getPrice()+"Kč/noc." +"\n Další vybavení: balkón: "+
                            room1.getIsBalcon()+","+" Výhled na moře: "+room1.getIsSeaView()+".");
        System.out.println("Pokoj číslo "+room3.getNumberOfBeds()+" je "+ room1.getNumberOfBeds()+"lůžkový"+
                            " za cenu "+ room3.getPrice()+"Kč/noc."+" Další vybavení: balkón: "+ room3.getIsBalcon()+
                            " Výhled na moře: "+ room3.getIsSeaView());


    }
}