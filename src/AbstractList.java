import java.util.*;
public abstract class AbstractList<E> implements List<E> {
    private int size;
    /*
>bogdan
size
get
toString */
    public int size() {
        return size;
    }
    public abstract E get(int index);

    public abstract String toString();
    /*
>Logan
indexOf
isEmpty
contains


//>bogdan
//size
//get
    public abstract E get(int index);
//toString
    public abstract int size();

//>Logan
//indexOf
//isEmpty
//contains

//>Quynh
//add
    public abstract void add (E value);
//add(int, E)
    public abstract void add(int index, E value);
//remove




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

//test

}
