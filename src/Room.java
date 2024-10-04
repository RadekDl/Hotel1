public class Room {                 // POKOJ
        private int roomOfNumber; // číslo pokoje
        private  int numberOfBeds; //poče lůžek
        private boolean balcon;	// balkón
        private boolean seaWiew; // výhled na moře
        private double price;	// cena za pokoj


//konstruktor

        public Room(int roomOfNumber, int numberOfBeds, boolean balkon, boolean seaWiev, double price){
            this.roomOfNumber = roomOfNumber;
            this.numberOfBeds = numberOfBeds;
            this.balcon = balcon;
            this.seaWiew = seaWiew;
            this.price = price;

        }
}
