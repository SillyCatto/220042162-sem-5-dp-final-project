package factory;

import car.Car;
import car.ToyotaGR86;
import car.SubaruBRZ;

public class CoupeCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "toyota":
                return new ToyotaGR86();
            case "subaru":
                return new SubaruBRZ();
            default:
                System.out.println("Unknown coupe type: " + type);
                return null;
        }
    }
}
