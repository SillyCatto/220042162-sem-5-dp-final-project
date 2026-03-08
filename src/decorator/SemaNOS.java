package decorator;

import car.Car;

public class SemaNOS extends CarDecorator {
    public SemaNOS(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void carInfo() {
        super.carInfo();
        System.out.println("[+] Sema NOS System equipped.");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(">> Sema NOS boost activated.");
    }

    @Override
    public void applyNos() {
        System.out.println("Applying Sema NOS");
    }
}
