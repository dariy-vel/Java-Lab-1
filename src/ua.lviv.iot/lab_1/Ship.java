package ua.lviv.iot.lab_1;

public class Ship {
    private static int shipQantity;
    protected String shipType;
    protected String countryOfOrigin;
    private int tonnage;
    private String name;
    private int passengersQuantity;
    private String captainName;
    private double weight;

    @Override
    public String toString() {
        return "Ship{" +
                "shipType='" + shipType + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", tonnage=" + tonnage +
                ", name='" + name + '\'' +
                ", passengersQuantity=" + passengersQuantity +
                ", captainName='" + captainName + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void printStaticShipQuantity(){
        System.out.println(Ship.shipQantity);
    }

    public void printShipQuantity(){
        System.out.println(Ship.shipQantity);
    }

    public Ship() {
        this(10, "Titanic", 100, "Jackson",
                23.3, "passenger", "Britain");
    }

    public Ship(final int tonnage, final String name, final int passengersQuantity, final String captainName) {
        this(tonnage, name, passengersQuantity, captainName,
                23.3, "passenger", "Britain");
    }

    public Ship(final int tonnage, final String name, final int passengersQuantity,
                final String captainName, final double weight, final String shipType,
                final String countryOfOrigin) {
        this.tonnage = tonnage;
        this.name = name;
        this.passengersQuantity = passengersQuantity;
        this.captainName = captainName;
        this.weight = weight;
        this.shipType = shipType;
        this.countryOfOrigin = countryOfOrigin;

        Ship.shipQantity++;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(final int tonnage) {
        this.tonnage = tonnage;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }

    public void setPassengersQuantity(final int passengersQuantity) {
        this.passengersQuantity = passengersQuantity;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(final String captainName) {
        this.captainName = captainName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }
}
