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
    /*
>Logan
indexOf
isEmpty
contains

>Quynh
add
add(int, E)
remove


>Hon
set
clear
checkIndex*/
    private void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
/*
>Peter
hasNext
next
remove
     */

//    public boolean hasNext() {
//        return position < size();
//    }
    public abstract String toString();
//    public abstract boolean hasNext();
//    public abstract E next();
//
//    public abstract void remove();


    public abstract void add(int index, E value);
}
