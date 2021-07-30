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

        Iterator<String> itr = list2.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        Iterator<String> itr1 = list2.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }



        // use linkedlist as stack

        LinkedList<String > stack = new LinkedList<>();
        stack.push("hello");
        stack.push("hi");
        stack.push("haw are tou");
        stack.sort(String::compareToIgnoreCase);
        stack.indexOf( "hello" );

        Collections.sort( stack, Collections.reverseOrder() );


        System.out.println(stack);




        //HashSet

        Set<Integer> set = new HashSet<>();
        set.add(1);
        boolean result = set.contains( 1 );
        System.out.println(result);



        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add( 1 );
        set1.add( 2 );



        TreeSet<String> set2 = new TreeSet<>();
        set2.add( "apple" );
        set2.add("banana");
        set2.add("Grapes");

        System.out.println(set2);



        // Streams can be aplied on arrays

        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10-i;
        }

        List<Integer> integerList =  Arrays.asList( numbers );
        System.out.println(integerList.stream().map( number -> number *2 ).collect( Collectors.toList() ));
        System.out.println(integerList);
        System.out.println(integerList.stream().filter( number -> number%2 ==0).collect( Collectors.toList() ));
        System.out.println(integerList.stream().sorted().collect( Collectors.toList() ));


        try (Stream<Integer> st = Stream.of( 1, 2, 3, 4, 5, 6 )) {
            System.out.println( st.collect( Collectors.toList() ) );
        }


        HashSet<String> hs = new HashSet<String>( Arrays.asList( "Strawberry", "Grapes", "Jamun", "Pineapple" ) );

        System.out.println(hs.stream().sorted().collect( Collectors.toList() ));


        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> lis2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfNumbers = Arrays.asList(list1, lis2, list3);

        System.out.println(listOfNumbers.stream().flatMap( Collection::stream ).collect( Collectors.toList() ));


        //peek method is used for debugging purpose
        List<String> words = Arrays.asList( "Apple", "Banana", "Orange", "Mango", "Grapes" );
        long length = words.stream().filter( eachWord -> eachWord.length() ==6  ).peek( System.out::println ).count();
        System.out.println(length);
    }
}
