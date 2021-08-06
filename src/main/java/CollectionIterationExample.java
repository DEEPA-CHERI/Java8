import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main( String[] args ) {
        List<Person> people = Arrays.asList(new Person( "Arika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Asya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ),new Person( "Arika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Asya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ),
new Person( "Arika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Asya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ),new Person( "Arika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Asya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ),
        new Person( "Arika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Asya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ));


        //External Iterators
        //forloop
        for(int i=0;i<people.size();i++){
            System.out.println(people.get( i ));
        }

        //foreach
        for(Person person:people){
            System.out.println(person);
        }

        //java8 using lambda
        people.forEach( System.out::println );




        //Streams - A sequence of elements supporting sequential and parallel aggregate operations.
        System.out.println( System.currentTimeMillis());
        people.parallelStream().filter( p -> p.getFirstName().startsWith( "A" ) ).forEachOrdered( System.out::println );

        System.out.println(System.currentTimeMillis());



        List<Integer> li = Arrays.asList( 1,2,3,4,5 );

       Integer val = li.parallelStream().map( each -> each*10 ).reduce( 0, (sum, value) -> sum+value );
        System.out.println(val);

    }
}
