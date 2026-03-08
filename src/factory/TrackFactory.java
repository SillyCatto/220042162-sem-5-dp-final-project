package factory;

import track.Track;
import track.BlueMoonBaySpeedway;
import track.BBRaceway;
import track.CircuitDeSpa;

public class TrackFactory {
    public static Track createTrack(String type) {
        switch (type.toLowerCase()) {
            case "usa":
                return new BlueMoonBaySpeedway();
            case "japan":
                return new BBRaceway();
            case "germany":
                return new CircuitDeSpa();
            default:
                System.out.println("Unknown track type: " + type);
                return null;
        }
    }
}
