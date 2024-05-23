public class StaticDemo {

    // Static variable
    static int staticVariable;

    // Static block
    static {
        System.out.println("Static block executed.");
        staticVariable = 10;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method executed.");
        System.out.println("Static variable value: " + staticVariable);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Accessing static variable
        System.out.println("Initial static variable value: " + staticVariable);

        // Modifying static variable
        staticVariable = 20;
        System.out.println("Modified static variable value: " + staticVariable);

        // Calling static method
        staticMethod();

        System.out.println("Main method ended.");
    }
}
