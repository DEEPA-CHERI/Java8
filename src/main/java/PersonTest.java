import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class PersonTest {

    public static void main( String[] args ) {
        List<Person> people = Arrays.asList(new Person( "Harika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Lasya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ));


//        Java7

        Collections.sort( people, new Comparator<Person>() {
            @Override
            public int compare( Person o1, Person o2 ) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        } );
        printAll(people);
        performConditionally( people, new FilterCondition() {
            @Override
            public boolean test( Person p ) {
                return p.getFirstName().startsWith( "A" );
            }
        }, new Consumer<Person>() {
            @Override
            public void accept( Person person ) {
                System.out.println( person+" " );
            }
        } );

    //Jva8
        Collections.sort( people, (p1,p2) -> p1.getLastName().compareTo( p2.getLastName() ) );

        Printer printToConsole = () -> people.forEach( System.out::println );
        printToConsole.printToConsole();

        performConditionally( people, ( p1) -> p1.getLastName().startsWith("M"), p1-> System.out.println(""+p1) );



    }

    private static void performConditionally( List<Person> people , FilterCondition c, Consumer<Person> consumer) {
        for(Person person:people){
            if(c.test(person))
                consumer.accept( person );
        }
    }

    private static void printAll( List<Person> people ) {
        for(Person person:people){
            System.out.println(person);
        }
    }
}
