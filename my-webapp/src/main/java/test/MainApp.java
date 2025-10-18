package test;

public class MainApp {
    public static void main(String[] args) {
        // 1. Create an instance (object) of the MyUtility class
        MyUtility utility = new MyUtility();

        // 2. Call the addNumbers method and store the result
        int sum = utility.addNumbers(10, 5);
        System.out.println("The sum is: " + sum); // Output: The sum is: 15

        // 3. Call the getGreeting method and store the result
        String greeting = utility.getGreeting("Alice");
        System.out.println(greeting); // Output: Hello, Alice!
    }
}
