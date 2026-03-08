package strategy;

public class HoneywellTurbo implements TurbochargerBehavior {
    @Override
    public void performTurbo() {
        System.out.println("Honeywell Turbocharger engaged.");
    }
}
