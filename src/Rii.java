import car.Car;
import command.RaceController;
import player.Player;
import race.Race;
import track.Track;

public class Rii {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("       RACING IN IUT");
        System.out.println("======================================\n");

        RaceController controller = new RaceController();

        controller.initializePlayer();

        Car car = controller.chooseCar();
        if (car == null) return;

        controller.tuneCar(car);

        Track track = controller.chooseTrack();
        if (track == null) return;

        Race race = controller.chooseRace();
        if (race == null) return;

        race.race(car, track);

        System.out.println("Thanks for playing, " + Player.getInstance().getName() + "!");
    }
}
