package race;

import track.Track;

public class CircuitRace extends Race {
    @Override
    protected void finishLine(Track track) {
        System.out.println("Circuit Race: Completed the lap. Finish line is at the start of the track.");
        track.finishLine();
    }
}
