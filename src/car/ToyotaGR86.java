package car;

import strategy.V6Engine;
import strategy.AlpineTurbo;

public class ToyotaGR86 extends Car {
    public ToyotaGR86() {
        this.engineBehavior = new V6Engine();
        this.turbochargerBehavior = new AlpineTurbo();
    }

    @Override
    public void carInfo() {
        System.out.println("=== Toyota GR86 (Coupe) ===");
        System.out.println("A lightweight, rear-wheel-drive sports coupe.");
        performEngine();
        performTurbo();
    }
}
