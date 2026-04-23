import java.util.*;

class RentACarService {
    private Map<Integer, User> users = new HashMap<>();

    private Set<Vehicle> vehicles = new TreeSet<>();

    private List<Reservation> reservations = new ArrayList<>();
    private List<Location> locations = new ArrayList<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void displayAllUsers() {
        System.out.println("--- Utilizatori Inregistrati ---");
        for (User user : users.values()) {
            System.out.println(user.toString());
        }
    }

    public void displayVehiclesSortedByPrice() {
        System.out.println("--- Vehicule Sortate Dupa Pret ---");
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }

    public Vehicle findVehicleById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public void createReservation(int reservationId, int clientId, int vehicleId, int days) {
        User user = users.get(clientId);
        Vehicle vehicle = findVehicleById(vehicleId);

        if (user instanceof Client && vehicle != null) {
            Reservation res = new Reservation(reservationId, (Client) user, vehicle, days);
            reservations.add(res);
            System.out.println("Rezervare creata cu succes!");
        } else {
            System.out.println("Eroare: Client sau Vehicul invalid.");
        }
    }

    public void displayAllReservations() {
        System.out.println("--- Toate Rezervarile ---");
        for (Reservation r : reservations) {
            System.out.println(r.toString());
        }
    }

    public void displayReservationsByClient(int clientId) {
        System.out.println("--- Rezervari pentru Clientul ID: " + clientId + " ---");
        for (Reservation r : reservations) {
            if (r.getClient().getId() == clientId) {
                System.out.println(r.toString());
            }
        }
    }

    public void cancelReservation(int reservationId) {
        reservations.removeIf(r -> r.getId() == reservationId);
        System.out.println("Rezervarea " + reservationId + " a fost anulata.");
    }
}