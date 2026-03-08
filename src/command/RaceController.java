package command;

import car.Car;
import factory.CarFactory;
import factory.CoupeCarFactory;
import factory.RoadsterCarFactory;
import factory.TrackFactory;
import player.Player;
import race.Race;
import race.SprintRace;
import race.CircuitRace;
import strategy.*;
import track.Track;
import util.InputHelper;

public class RaceController {

    public void initializePlayer() {
        Player player = Player.getInstance();
        System.out.print("Enter your name: ");
        player.setName(InputHelper.readLine());
        System.out.println("Welcome, " + player.getName() + "!\n");
    }

    public Car chooseCar() {
        Menu<Car> categoryMenu = new Menu<>("Choose Car Category");
        categoryMenu.addOption(1, "Coupe (Toyota GR86, Subaru BRZ)", this::chooseCoupe);
        categoryMenu.addOption(2, "Roadster (Porsche Boxster, Ferrari 812)", this::chooseRoadster);
        return categoryMenu.choose();
    }

    private Car chooseCoupe() {
        CarFactory factory = new CoupeCarFactory();
        Menu<Car> menu = new Menu<>("Choose Coupe");
        menu.addOption(1, "Toyota GR86", () -> factory.createCar("toyota"));
        menu.addOption(2, "Subaru BRZ", () -> factory.createCar("subaru"));
        return menu.choose();
    }

    private Car chooseRoadster() {
        CarFactory factory = new RoadsterCarFactory();
        Menu<Car> menu = new Menu<>("Choose Roadster");
        menu.addOption(1, "Porsche Boxster", () -> factory.createCar("porsche"));
        menu.addOption(2, "Ferrari 812", () -> factory.createCar("ferrari"));
        return menu.choose();
    }

    public void tuneCar(Car car) {
        System.out.println("\n--- Tune Your Car ---");

        Menu<EngineBehavior> engineMenu = new Menu<>("Choose Engine (0 to keep default)");
        engineMenu.addOption(1, "V6 Engine", V6Engine::new);
        engineMenu.addOption(2, "V8 Engine", V8Engine::new);
        engineMenu.addOption(3, "V12 Engine", V12Engine::new);
        EngineBehavior engine = engineMenu.choose();
        if (engine != null) {
            car.setEngineBehavior(engine);
        } else {
            System.out.println("Keeping default engine.");
        }

        Menu<TurbochargerBehavior> turboMenu = new Menu<>("Choose Turbocharger (0 to keep default)");
        turboMenu.addOption(1, "Alpine Turbo", AlpineTurbo::new);
        turboMenu.addOption(2, "Cummins Turbo", CumminsTurbo::new);
        turboMenu.addOption(3, "Honeywell Turbo", HoneywellTurbo::new);
        TurbochargerBehavior turbo = turboMenu.choose();
        if (turbo != null) {
            car.setTurbochargerBehavior(turbo);
        } else {
            System.out.println("Keeping default turbocharger.");
        }

        System.out.println("Car tuning complete!\n");
    }

    public Track chooseTrack() {
        Menu<Track> menu = new Menu<>("Choose Track");
        menu.addOption(1, "Blue Moon Bay Speedway (USA)", () -> TrackFactory.createTrack("usa"));
        menu.addOption(2, "BB Raceway (Japan)", () -> TrackFactory.createTrack("japan"));
        menu.addOption(3, "Circuit de Spa-Francorchamps (Germany)", () -> TrackFactory.createTrack("germany"));
        return menu.choose();
    }

    public Race chooseRace() {
        Menu<Race> menu = new Menu<>("Choose Race Type");
        menu.addOption(1, "Sprint Race (finish at end of track)", SprintRace::new);
        menu.addOption(2, "Circuit Race (finish at start of track)", CircuitRace::new);
        return menu.choose();
    }
}
