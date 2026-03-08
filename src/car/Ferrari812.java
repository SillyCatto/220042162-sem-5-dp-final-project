package car;

import strategy.V12Engine;
import strategy.HoneywellTurbo;

public class Ferrari812 extends Car {
    public Ferrari812() {
        this.engineBehavior = new V12Engine();
        this.turbochargerBehavior = new HoneywellTurbo();
    }

    @Override
    public void carInfo() {
        System.out.println("=== Ferrari 812 (Roadster) ===");
        System.out.println("A front-engine, rear-wheel-drive grand tourer roadster.");
        performEngine();
        performTurbo();
    }
}
