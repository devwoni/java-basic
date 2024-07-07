package poly.car1;


public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3car = new K3Car();

        driver.setCar(k3car);
        driver.drive();

        Model3Car model3car = new Model3Car();
        driver.setCar(model3car);
        driver.drive();

        NewCar newcar = new NewCar();
        driver.setCar(newcar);
        driver.drive();
    }
}
