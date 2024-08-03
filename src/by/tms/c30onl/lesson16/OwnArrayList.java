package by.tms.c30onl.lesson16;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OwnArrayList<E> implements List<E> {
    private int size;
    private int capacity;
    private static final Object[] EMPTY_ARRAY_DATA = {};
    private Object[] arrayData;

    public OwnArrayList(int requestedCapacity) {
        if (requestedCapacity > 0) {
            arrayData = new Object[requestedCapacity];
        } else if (requestedCapacity == 0) {
            arrayData = EMPTY_ARRAY_DATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + requestedCapacity);
        }
        capacity = requestedCapacity;
    }

    @Override
    public boolean add(E e) {
        if (size == capacity) {
            capacity = capacity * 2;
            Object[] newArray = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = arrayData[i];
                arrayData[i] = null;
            }
            arrayData = newArray;
        }
        arrayData[size++] = e;
        return true;
    }

//    private void expand() {
//        int ii = capacity >> 1;
//        capacity = capacity + ii; //capacity >> 1;
//        Object[] newArray = new Object[capacity];
//        for (int i = 0; i < size; i++) {
//            newArray[i] = arrayData[i];
//            arrayData[i] = null;
//        }
//        arrayData = newArray;
//        int i = 0;
//    }

    public E get(int index) {
        if (!check(index)) throw new IndexOutOfBoundsException();
        return (E) arrayData[index];
    }

    public E set(int index, E element) {
        if (!check(index)) throw new IndexOutOfBoundsException();
        E old = (E) arrayData[index];
        arrayData[index] = element;
        return old;
    }

    @Override
    public void add(int index, E element) {

    }

    public E remove(int index) {
        if (!check(index)) throw new IndexOutOfBoundsException();
        E element = (E) arrayData[index];
        arrayData[index] = null;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = arrayData[i];
            arrayData[i] = null;
        }
        for (int i = index + 1; i < capacity; i++) {
            newArray[i - 1] = arrayData[i];
            arrayData[i] = null;
        }
        arrayData = newArray;
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < size; i++) {
            if (o.equals(arrayData[i])) {
                remove(i);
                break;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arrayData[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(arrayData[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    private boolean check(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }
}