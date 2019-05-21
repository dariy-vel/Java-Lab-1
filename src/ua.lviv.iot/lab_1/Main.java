package ua.lviv.iot.lab_1;

public class Main {
    public static void main(String[] args) {
        Ship defalutShip = new Ship();
        Ship ship4paramaters = new Ship(
                15,
                "Mauritania",
                200,
                "Johnson"
        );
        Ship customizedShip = new Ship(
                150,
                "Big John",
                20,
                "Johnson",
                14.4,
                "cargo",
                "Ukraine"
        );

        System.out.println(defalutShip);
        System.out.println(ship4paramaters);
        System.out.println(customizedShip);

        defalutShip.printShipQuantity();
        ship4paramaters.printShipQuantity();
        customizedShip.printShipQuantity();

        Ship.printStaticShipQuantity();
    }
}
