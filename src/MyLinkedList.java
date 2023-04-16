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
        MyNode<T> newNode = new MyNode<>(item);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        MyNode<T> current = head;
        MyNode<T> previous = null;
        int i = 0;
        while (current != null && i != index) {
            previous = current;
            current = current.next;
            i++;
        }
        if (previous == null) {
            newNode.next = head;
            head = newNode;
        } else {
            previous.next = newNode;
            newNode.next = current;
        }
        size++;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public boolean remove(T item) {
        if (!contains(item)) {
            return false;
        }
        remove(indexOf(item));
        return true;
    }


    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public void clearTEST() {
        MyNode<T> current = head;
        for (current.next = head; current.next != null; ) {
            current.data = null;
            current.next = null;
        }
        head = tail = null;
        size = 0;
    }


    @Override
    public int indexOf(Object o) {
        int index = 0;
        MyNode<T> current;
        if (o == null) {
            for (current = head; current != null; current = current.next) {
                if (current.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (current = head; current != null; current = current.next) {
                if (o.equals(current.data)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object o) {
        MyNode<T> current = head;
        int last = -1;
        for (int i = 0; i < size; i++) {
            if (current.data.equals(o)) {
                last = i;
            }
            current = current.next;
        }
        return last;
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
