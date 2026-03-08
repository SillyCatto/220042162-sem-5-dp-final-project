package factory;

import car.Car;
import car.PorscheBoxster;
import car.Ferrari812;

public class RoadsterCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "porsche":
                return new PorscheBoxster();
            case "ferrari":
                return new Ferrari812();
            default:
                System.out.println("Unknown roadster type: " + type);
                return null;
        }
    }
}
