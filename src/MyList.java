public interface MyList<T> {

    int size();
    void add(T item);
    T remove(int index);
    T get(int index);
}
