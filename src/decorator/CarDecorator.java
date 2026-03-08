package decorator;

import car.Car;

public abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void carInfo() {
        decoratedCar.carInfo();
    }

    @Override
    public void start() {
        decoratedCar.start();
    }

    @Override
    public void stop() {
        decoratedCar.stop();
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
    }

    @Override
    public void performEngine() {
        decoratedCar.performEngine();
    }

    @Override
    public void performTurbo() {
        decoratedCar.performTurbo();
    }

    public abstract void applyNos();
}
