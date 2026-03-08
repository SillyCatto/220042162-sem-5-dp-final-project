package car;

import strategy.EngineBehavior;
import strategy.TurbochargerBehavior;

public abstract class Car {
    protected EngineBehavior engineBehavior;
    protected TurbochargerBehavior turbochargerBehavior;

    public abstract void carInfo();

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void performEngine() {
        engineBehavior.performEngine();
    }

    public void performTurbo() {
        turbochargerBehavior.performTurbo();
    }

    public void setEngineBehavior(EngineBehavior engineBehavior) {
        this.engineBehavior = engineBehavior;
    }

    public void setTurbochargerBehavior(TurbochargerBehavior turbochargerBehavior) {
        this.turbochargerBehavior = turbochargerBehavior;
    }

    public EngineBehavior getEngineBehavior() {
        return engineBehavior;
    }

    public TurbochargerBehavior getTurbochargerBehavior() {
        return turbochargerBehavior;
    }
}
