package race;

import track.Track;

public class SprintRace extends Race {
    @Override
    protected void finishLine(Track track) {
        System.out.println("Sprint Race: Reached the end of the track");
        track.finishLine();
    }
}
