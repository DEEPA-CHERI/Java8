public class ClosureExamples {

    public static void main( String[] args ) {
        int a =10;
        int b =30; // Effectively final or must be final

        doProcess(() -> System.out.println( a+b ) );


    }

    private static void doProcess(Process p){
        p.process();
    }
}
interface Process {
    void process();
}
