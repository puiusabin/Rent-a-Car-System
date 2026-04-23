public class Main {
    public static void main(String[] args) {
        RentACarService service = new RentACarService();

        // Initial data (client + employee)
        service.addUser(new Client(1, "Ion Popescu", "B123456"));
        service.addUser(new Employee(2, "Maria Ionescu", 4500.0));

        // Add Vehicles
        service.addVehicle(new Car(101, "Dacia Logan", 150.0, 5));
        service.addVehicle(new Van(102, "Ford Transit", 300.0, 15.5));
        service.addVehicle(new Car(103, "Toyota Yaris", 120.0, 5));

        service.addLocation(new Location(1, "Bucuresti Otopeni"));

        // Testing stdout
        service.displayAllUsers();
        service.displayVehiclesSortedByPrice();

        // Create Reservations
        service.createReservation(1001, 1, 103, 3);
        service.createReservation(1002, 1, 102, 2);

        // Display all reservations
        service.displayAllReservations();

        // Find a specific reservation
        service.displayReservationsByClient(1);

        // Canceling a reservation
        service.cancelReservation(1002);

        System.out.println("\nDupa anulare:");
        service.displayAllReservations();
    }
}