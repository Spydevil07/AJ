package Famt;

public class Demo {

    public static void main(String[] args) {
        // Lambda expression to add two numbers
        AddFunction addFunction = (a, b) -> a + b;

        // Example numbers
        int num1 = 5;
        int num2 = 7;

        // Calling the lambda expression
        int sum = addFunction.add(num1, num2);
        
        // Printing the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Functional interface for addition functions
    interface AddFunction {
        int add(int a, int b);
    }
}
