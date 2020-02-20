import java.util.*;
public abstract class AbstractList<E> implements List<E> {


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
//add(int, E)
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



}
