package system_design.cache;

public interface Cache<T extends Comparable<T>> {

    void add(String key, T item);

    T get(String key);
}
