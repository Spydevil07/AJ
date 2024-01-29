package Famt;

public class Demo {

    public static void main(String[] args) {
        // Lambda expression to print "Hello World"
        GreetingFunction helloWorldGreeting = () -> System.out.println("Hello World");

        // Calling the lambda expression
        helloWorldGreeting.sayHello();
    }

    // Functional interface for greeting functions
    interface GreetingFunction {
        void sayHello();
    }
}
