package command;

import util.InputHelper;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu<T> {
    private final String title;
    private final Map<Integer, MenuOption<T>> options = new LinkedHashMap<>();

    public Menu(String title) {
        this.title = title;
    }

    public void addOption(int key, String label, Command<T> command) {
        options.put(key, new MenuOption<>(label, command));
    }

    public T choose() {
        System.out.println("--- " + title + " ---");
        for (Map.Entry<Integer, MenuOption<T>> entry : options.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().label);
        }
        System.out.print("Enter choice: ");
        int choice = InputHelper.readInt();

        MenuOption<T> selected = options.get(choice);
        if (selected != null) {
            return selected.command.execute();
        }
        return null;
    }

    private static class MenuOption<T> {
        final String label;
        final Command<T> command;

        MenuOption(String label, Command<T> command) {
            this.label = label;
            this.command = command;
        }
    }
}
