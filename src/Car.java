class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int id, String brand, double pricePerDay, int numberOfSeats) {
        super(id, brand, pricePerDay);
        this.numberOfSeats = numberOfSeats;
    }
}