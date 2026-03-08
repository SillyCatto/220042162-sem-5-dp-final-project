package car;

import strategy.V6Engine;
import strategy.CumminsTurbo;

public class SubaruBRZ extends Car {
    public SubaruBRZ() {
        this.engineBehavior = new V6Engine();
        this.turbochargerBehavior = new CumminsTurbo();
    }

    @Override
    public void carInfo() {
        System.out.println("=== Subaru BRZ (Coupe) ===");
        System.out.println("A nimble, driver-focused sports coupe.");
        performEngine();
        performTurbo();
    }
}
