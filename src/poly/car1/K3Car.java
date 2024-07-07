package poly.car1;

public class K3Car implements Car {
    public K3Car() {
        super();
    }

    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }

    @Override
    public void stopEngine() {
        System.out.println("K3Car.stopEngine");
    }
}
