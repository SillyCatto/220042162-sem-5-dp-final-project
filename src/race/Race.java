package race;

import car.Car;
import command.Menu;
import decorator.CarDecorator;
import decorator.ResonacNOS;
import decorator.SemaNOS;
import track.Track;

import java.util.Random;

public abstract class Race {

    public final void race(Car car, Track track) {
        System.out.println("\n========== RACE START ==========\n");

        car.carInfo();
        System.out.println();

        track.trackInfo();
        System.out.println();

        startCar(car);
        startLine(track);
        accelerateCar(car);

        CarDecorator nos = pitStop(car);
        applyNos(nos);

        finishLine(track);
        stopCar(nos);

        lapTime();

        System.out.println("\n========== RACE END ==========\n");
    }

    protected void startCar(Car car) {
        car.start();
    }

    protected void startLine(Track track) {
        track.startLine();
    }

    protected void accelerateCar(Car car) {
        car.accelerate();
        car.performEngine();
        car.performTurbo();
    }

    protected CarDecorator pitStop(Car car) {
        System.out.println("\n--- PIT STOP ---");

        Menu<CarDecorator> nosMenu = new Menu<>("Choose NOS type");
        nosMenu.addOption(1, "Resonac NOS", () -> new ResonacNOS(car));
        nosMenu.addOption(2, "Sema NOS", () -> new SemaNOS(car));
        CarDecorator nos = nosMenu.choose();

        if (nos == null) {
            nos = new ResonacNOS(car);
        }

        System.out.println("NOS equipped successfully");
        nos.carInfo();
        System.out.println("--- PIT STOP COMPLETE ---\n");
        return nos;
    }

    protected void applyNos(CarDecorator nos) {
        nos.applyNos();
    }

    protected abstract void finishLine(Track track);

    protected void stopCar(Car car) {
        car.stop();
    }

    protected void lapTime() {
        Random random = new Random();
        int totalSeconds = random.nextInt(3600);
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("Lap Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
