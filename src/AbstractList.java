import java.util.*;
public class AbstractList {
    /*
>bogdan
size
get
toString

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
}
