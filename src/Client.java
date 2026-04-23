class Client extends User {
    private String licenseNumber;

    public Client(int id, String name, String licenseNumber) {
        super(id, name);
        this.licenseNumber = licenseNumber;
    }
    public String getLicenseNumber() { return licenseNumber; }
    @Override
    public String toString() { return "Client[id=" + id + ", name=" + name + "]"; }
}