package track;

public class BBRaceway extends Track {
    @Override
    public void trackInfo() {
        System.out.println("=== BB Raceway (Japan) ===");
        System.out.println("A technical circuit located in Japan.");
    }

    @Override
    public void finishLine() {
        System.out.println("Crossed the finish line at BB Raceway.");
    }
}
