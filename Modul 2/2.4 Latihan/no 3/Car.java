public class Car {
    int cadence;
    int speed;
    int gear;

    void changeCadence(int carCadence) {
        cadence = carCadence;
    }

    void speedUp(int carSpeed) {
        speed = carSpeed;
    }

    void changeGear(int carGear) {
        gear = carGear;
    }

    void printInfo() {
        System.out.println("Car");
        System.out.println("Candence : " + cadence);
        System.out.println("Speed    : " + speed);
        System.out.println("Gear     : " + gear);
    }
}
