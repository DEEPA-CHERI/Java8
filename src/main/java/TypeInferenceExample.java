//compiler
public class TypeInferenceExample {
    public static void main( String[] args ) {
        StringUtil utility = s -> s.length();
        System.out.println(utility.len( "Hello People!!" ));
    }
    interface StringUtil{
        int len(String word);
    }
}
