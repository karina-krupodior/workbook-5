public class MainApp {
    public static void main(String[] args) {
        // Moped
        Moped slowRide = new Moped("Red",5,1,20);

//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);
//        slowRide.setNumberOfPassengers(1);
//        slowRide.setCargoCapacity(20);
        // Car
//        Car car = new Car();
//        car.setColor("black");
//        car.setFuelCapacity(10);
//        car.setNumberOfPassengers(4);
//        car.setCargoCapacity(300);

        Car car = new Car("Blue", 5, 100, 50);

        // SemiTruck
        SemiTruck truck = new SemiTruck("white",2,50,500);
//        truck.setColor("white");
//        truck.setCargoCapacity(50);
//        truck.setNumberOfPassengers(2);
//        truck.setFuelCapacity(500);

        // Hovercraft
        Hovercraft hovercraft = new Hovercraft("Silver",4,80,500);
//        hovercraft.setColor("Silver");
//        hovercraft.setFuelCapacity(80);
//        hovercraft.setNumberOfPassengers(4);
//        hovercraft.setCargoCapacity(500);

        System.out.println("Moped color: " + slowRide.getColor() + ", Fuel: " + slowRide.getFuelCapacity());
        System.out.println("Car color: " +  car.getColor() + " "  + "Flue: " + car.getFuelCapacity() + "Passengers: " + car.getNumberOfPassengers() + "CargoCapacity: " + car.getCargoCapacity() );
        System.out.println("Semi Truck color: " + truck.getColor() + " " + "Flue" + truck.getFuelCapacity() + "Passengers: " + truck.getNumberOfPassengers() );
        System.out.println("Hovercraft color: " + hovercraft.getColor() +  " " + "CargoCapacity: " + car.getCargoCapacity()  );


    }
}
