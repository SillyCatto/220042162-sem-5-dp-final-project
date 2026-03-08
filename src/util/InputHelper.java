package util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static String readLine() {
        return scanner.nextLine();
    }
}
