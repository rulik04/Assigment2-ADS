public interface MyList<T> {

    int size();
    void add(T item);
    T remove(int index);
    T get(int index);
    void add(T item, int index);
    boolean remove (T item);
    void clear();
    int indexOf(Object o);
    int lastIndexOf(Object o);
    boolean contains(Object o);
}
