class Van extends Vehicle {
    private double cargoCapacity;

    public Van(int id, String brand, double pricePerDay, double cargoCapacity) {
        super(id, brand, pricePerDay);
        this.cargoCapacity = cargoCapacity;
    }
}