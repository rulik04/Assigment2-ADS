public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    int size;

    public MyLinkedList() {

    }

    @Override
    public void add(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T remove(int index) {
        T removed;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (index == 0) {
            removed = head.data;
            head = head.next;
        } else {
            MyNode<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removed = current.next.data;
            current.next = current.next.next;
        }
        size--;

        return removed;
    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public boolean remove(T item) {
        return false;
    }


    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }


    private static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode<E> previous;

        MyNode(E data) {
            this.data = data;
        }
    }
}
