import java.util.*;
public abstract class AbstractList<E> implements List<E> {

    private int size;

    public AbstractList() {
        size = 0;
    }
    public int size() {
        return size;
    }
    public void sizeIn() {
        size++;  //to increment
    }
    public void sizeDe() {
        size--; //to decrement
    }

    //Imports iterator versions of the list and returns it.
    public E get(int index) {
        Iterator<E> list = iterator();
        E num = null;
        for (int x = 0; x < index; x++) {
            num = list.next();
        }
        return num;
    }
    public abstract String toString();
    public int indexOf(E value) {
       for (int i = 0; i < size(); i++) {
           if (value.equals(get(i))) {
               return i;
           }
       }
       return -1;
    }
    public boolean isEmpty() {
       return size() == 0;
    }
    public boolean contains(E value) {
        return indexOf(value) >= 0;
    }
    public void add (E value) {
       add(size(), value);
    }
    public abstract void add(int index, E value);

    //Imports iterator versions of the list and removes the selected item
    public void remove(int index) {
        Iterator<E> list = iterator();
        for (int x = 0; x < index; x++) {
            list.next();
        }
        list.remove();
    }
    public abstract void set(int index, E value);
    public abstract void clear();
    public abstract Iterator<E> iterator();

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
