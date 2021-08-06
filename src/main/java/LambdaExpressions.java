//Lambda

// It is tempting to say syntactic sugar on anonymous inner class
//It is not shortcut for innerclass
//Interface should have only one abstract method
//Functional interface - interface have only one abstract method, it ios good practice to add if it is for lambda
//Type of lambda is interface
//We don;t need to create everytime interfaces we have set of function interfaces to implement lambda expressions
//Lambda expressions does not have this own context it shares the parent context where as inner aonymous class has its own contexts
public class LambdaExpressions {

    public static void main( String[] args ) {

        //lambda Greeting
        Greeting lambdaGreeting = () -> { System.out.println("Hello people!!!");};
        lambdaGreeting.greet();

        //anonymous inner class
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello People!!!");
            }
        };
        innerClassGreeting.greet();




    }
}

