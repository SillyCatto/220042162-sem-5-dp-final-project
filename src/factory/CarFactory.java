package factory;

import car.Car;

public abstract class CarFactory {
    public abstract Car createCar(String type);
}
