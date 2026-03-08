package command;

@FunctionalInterface
public interface Command<T> {
    T execute();
}
