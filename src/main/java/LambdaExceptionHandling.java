import java.util.function.BiConsumer;
// we can hnadle exception where we define our lambda expresssion but that is not elegant.
public class LambdaExceptionHandling {
    public static void main( String[] args ) {
        int[] somenumbers = {1, 2, 3, 4};
        int key = 0;
        process( somenumbers, key, wrapperLambda(( v, k ) -> System.out.println( v / k )));
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        try{
//            consumer.accept();
        } catch (Exception e) {
            e.printStackTrace();
        }
    return consumer;
    }
    private static void process( int[] somenumbers, int key, BiConsumer<Integer, Integer> consumer ) {
        for (int i : somenumbers) {
            consumer.accept( i, key );
        }
    }
}
