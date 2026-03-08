package track;

public class BlueMoonBaySpeedway extends Track {
    @Override
    public void trackInfo() {
        System.out.println("=== Blue Moon Bay Speedway (USA) ===");
        System.out.println("A fast oval speedway located in the United States.");
    }

    @Override
    public void finishLine() {
        System.out.println("Crossed the finish line at Blue Moon Bay Speedway.");
    }
}
