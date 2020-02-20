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
    public abstract void checkIndex(int index);
}
