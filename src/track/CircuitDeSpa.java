package track;

public class CircuitDeSpa extends Track {
    @Override
    public void trackInfo() {
        System.out.println("=== Circuit de Spa-Francorchamps (Germany) ===");
        System.out.println("A legendary high-speed circuit in the Ardennes.");
    }

    @Override
    public void finishLine() {
        System.out.println("Crossed the finish line at Circuit de Spa-Francorchamps.");
    }
}
