class Reservation {
    private int id;
    private Client client;
    private Vehicle vehicle;
    private int days;

    public Reservation(int id, Client client, Vehicle vehicle, int days) {
        this.id = id;
        this.client = client;
        this.vehicle = vehicle;
        this.days = days;
    }

    public int getId() { return id; }
    public Client getClient() { return client; }
    public double getTotalPrice() { return vehicle.getPricePerDay() * days; }

    @Override
    public String toString() {
        return "Rezervare ID: " + id + " | Client: " + client.getName() + " | Vehicul: " + vehicle.getBrand() + " | Zile: " + days + " | Total: " + getTotalPrice();
    }
}