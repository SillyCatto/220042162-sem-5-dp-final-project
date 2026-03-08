package strategy;

public class AlpineTurbo implements TurbochargerBehavior {
    @Override
    public void performTurbo() {
        System.out.println("Alpine Turbocharger engaged.");
    }
}
