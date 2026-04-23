abstract class Vehicle implements Comparable<Vehicle> {
    protected int id;
    protected String brand;
    protected double pricePerDay;

    public Vehicle(int id, String brand, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public double getPricePerDay() { return pricePerDay; }

    // Sortare default crescătoare după preț
    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(this.pricePerDay, other.pricePerDay);
    }

    @Override
    public String toString() { return brand + " (Pret/zi: " + pricePerDay + ")"; }
}