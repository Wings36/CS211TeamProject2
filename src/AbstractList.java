import java.util.*;
public abstract class AbstractList<E> implements List<E> {

private int size;

//>bogdan
//size
    public int size() {
        return size;
    }
    /*public int getSize() {
        return this.size;
    }
    public int setSize() {
        return this.size;
    }*/
    public void sizeIn() {
        size++;  //to increment
    }
    public void sizeDe() {
        size--; //to decrement
    }
//get
    public abstract E get(int index);
//toString
    public abstract String toString();

    //>Logan
//indexOf
   public int indexOf(E value) {
       for (int i = 0; i < size(); i++) {
           if (value.equals(get(i))) {
               return i;
           }
       }
       return -1;
    }
//isEmpty
    public boolean isEmpty() {
       return size() == 0;
    }
//contains
    public boolean contains(E value) {
        return indexOf(value) >= 0;
    }

//>Quynh
//add
    public void add (E value) {
       add(size(), value);
    }
//add(int, E)
    public abstract void add(int index, E value);
//remove
    public abstract void remove(int index);


//>Hon
//set
    public abstract void set(int index, E value);
//clear
    public abstract void clear();
//checkIndex
    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list

    void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
