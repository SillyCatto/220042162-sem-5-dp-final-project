package car;

import strategy.V8Engine;
import strategy.HoneywellTurbo;

public class PorscheBoxster extends Car {
    public PorscheBoxster() {
        this.engineBehavior = new V8Engine();
        this.turbochargerBehavior = new HoneywellTurbo();
    }

    @Override
    public void carInfo() {
        System.out.println("=== Porsche Boxster (Roadster) ===");
        System.out.println("A mid-engine, rear-wheel-drive roadster.");
        performEngine();
        performTurbo();
    }
}
