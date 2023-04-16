public class MyArrayList<T> implements MyList<T> {
    private Object[] array;
    private int capacity = 5;
    int size = 0;

    public MyArrayList() {
        array = new Object[capacity];
    }

    @Override
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

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T newItem, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (size + 1 >= capacity) {
            increaseBuffer();
        }
        if (index > size) {
            index = size;
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = newItem;
        size++;
    }

    @Override
    public boolean remove(T item) {
        if ((size == 0)) {
            return false;
        }
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == null && item == null) {
                break;
            }
            if ((array[i] != null) && (array[i].equals(item))) {
                break;
            }
        }
        if (i < size) {
            for (int j = i; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            size--;
            return true;
        }
        return false;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public int indexOf(Object o) {
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == null && o == null) {
                break;
            }
            if ((array[i] != null) && (array[i].equals(o))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int i;
        for (i = size - 1; i >= 0; i--) {
            if (array[i] == null && o == null) {
                break;
            }
            if ((array[i] != null) && (array[i].equals(o))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
}
