import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollection {

    public static void main(String args[]){

        List<String> list = new ArrayList<String>(10);
        list.add("abcdf");
        list.add("ghi");
        list.add("d");
        list.add("jk");
        list.set( 1, "bcdef" );
        list.sort(new CustomComparator());
        System.out.println(list+"");


        LinkedList<String> list2 = new LinkedList<>();

        list2.add("hello");
        list2.addFirst("hi");
        list2.addLast("hiii");
        System.out.println(list2+"");

        Iterator itr = list2.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        Iterator itr1 = list2.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }



        // use linkedlist as stack

        LinkedList<String > stack = new LinkedList<>();
        stack.push("hello");
        stack.push("hi");
        System.out.println(stack.peekLast());
        System.out.println(stack.peekFirst());
        System.out.println(stack.pop());






    }
}
