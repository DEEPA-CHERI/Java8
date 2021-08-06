import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Method reference is an alternative way of writing lambdas

//Static method className::methodName
//instance method instance::MethodName
public class MethodReference {
    public static void main(String args[]){

        printMessage();
//        Thread t = new Thread(() -> printMessage());
        Thread t = new Thread( MethodReference::printMessage );
        t.start();

        List<Person> people = Arrays.asList(new Person( "Harika", "Dethadi", 25 ),
                new Person( "Abhi", "S", 30 ),
                new Person( "Lasya", "Manjkunath", 40 ),
                new Person( "Noel", "Sean", 36 ));

        performConditionally( people,  p1 -> p1.getLastName().startsWith("M"), System.out::println );


    }

    public static void printMessage(){
        System.out.println("Hello!!");
    }

    private static void performConditionally( List<Person> people , FilterCondition c, Consumer<Person> consumer) {
        for(Person person:people){
            if(c.test(person))
                consumer.accept( person );
        }
    }
}
