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

    public abstract E get(int index);

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
    public abstract void remove(int index);
    public abstract void set(int index, E value);
    public abstract void clear();

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list

    void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
