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
//add(int, E)
//remove



//>Hon
//set
    public abstract void set(int index, E value);
//clear
    public abstract void clear();
//checkIndex
    public abstract void checkIndex(int index);
}
