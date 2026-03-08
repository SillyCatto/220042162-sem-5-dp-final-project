package decorator;

import car.Car;

public class ResonacNOS extends CarDecorator {
    public ResonacNOS(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void carInfo() {
        super.carInfo();
        System.out.println("[+] Resonac NOS System equipped.");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(">> Resonac NOS boost activated.");
    }

    @Override
    public void applyNos() {
        System.out.println("Applying Resonac NOS");
    }
}
