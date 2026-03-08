package track;

public abstract class Track {
    public abstract void trackInfo();

    public void startLine() {
        System.out.println("Car is at the start line.");
    }

    public abstract void finishLine();
}
