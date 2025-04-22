//Zadanie 1+2
    public class Vehicle{
        public void start(){
            System.out.println("Pojazd został uruchomiony");
        }
        public void stop(){
            System.out.println("Pojazd się zatrzymał");
        }
    }
    class Car extends Vehicle{
        private int numberOfSeats;
        public Car(int numberOfSeats){
            this.numberOfSeats = numberOfSeats;
        }
        public int getNumberOfSeats(){
            return numberOfSeats;
        }
        @Override
        public void start() {
            System.out.println("Samochód został uruchomiony.");
        }

        @Override
        public void stop() {
            System.out.println("Samochód został zatrzymany.");
        }
    }
