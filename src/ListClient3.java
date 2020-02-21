//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")
//bogoros
//test`1

public class ListClient3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
    }

    public static void processList(AbstractList<Integer> list) {
        System.out.println("\n\n\nIs the list empty? : " + list.isEmpty() + "");
        list.add(42);
        list.add(18);
        list.add(27);
        list.add(93);
        list.add(32);
        list.add(234);
        list.add(39);
        list.add(934);
        System.out.println("adding numbers... \nIs the list empty? : " + list.isEmpty());
        System.out.println("List: " + list);
        System.out.println("The size of the list is :" + list.size());
        System.out.println("The number in index 4 is " + list.get(4));
        list.remove(2);
        list.remove(0);
        System.out.println(" Removed elements in index 2 and 0: " + list);
        System.out.println("The index of the number 32 of the list is : " + list.indexOf(32));
        System.out.println("Does the list contain number 420? : " + list.contains(420));
        System.out.println("Does the list contain number 39? : " + list.contains(39));
        list.add(4, 420);
        System.out.println("Added number 420 to index 4" + list);
        list.set(4, 100);
        System.out.println("Setting index number 4 to 100 :" + list);
        //This should pass without saying anything
        list.checkIndex(4);
        //This should throw a IndexOutOfBoundsException
        //list.checkIndex(100);
        list.clear();
        System.out.println("Clearing List: " + list);


    }
}
