//java8

// There are couple of generic interfaces created to use commonly instead of everytime creating a interface
import java.util.function.*;
public class FunctionInterfaceTest {

    public static void main( String[] args ) {

        Predicate predicate = word ->  word.equals( "GOOD" );
        System.out.println(predicate.test( "HELLO" ));
        System.out.println(predicate.test( "GOOD" ));

    }
}
