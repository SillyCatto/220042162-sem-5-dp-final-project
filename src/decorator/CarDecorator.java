package decorator;

import car.Car;
import strategy.EngineBehavior;
import strategy.TurbochargerBehavior;

public abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
        this.engineBehavior = decoratedCar.getEngineBehavior();
        this.turbochargerBehavior = decoratedCar.getTurbochargerBehavior();
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

    public abstract void applyNos();
}
