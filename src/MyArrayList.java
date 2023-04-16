public class MyArrayList<T> implements MyList<T> {
    private Object[] array;
    private int capacity = 5;
    int size = 0;

    public MyArrayList() {
        array = new Object[capacity];
    }

    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
    }

    private void increaseBuffer() {
        capacity = 2 * capacity;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return (T) array;
    }

    public int size() {
        return size;
    }
}
