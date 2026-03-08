package strategy;

public class CumminsTurbo implements TurbochargerBehavior {
    @Override
    public void performTurbo() {
        System.out.println("Cummins Turbocharger engaged.");
    }
}
