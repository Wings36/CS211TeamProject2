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
   public int indexOf(E value) {
       for (int i = 0; i < size(); i++) {
           if (value.equals(get(i))) {
               return i;
           }
       }
       return -1;
    }
//isEmpty
//contains

//>Quynh
//add
    public void add (E value) {
       return add(size, value);
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
    void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }



}
