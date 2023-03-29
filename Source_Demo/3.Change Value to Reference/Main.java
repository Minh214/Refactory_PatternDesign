public class Main {
    public static void main(String[] args) {
        // Creating an integer value
        int value = 10;

        // Changing the value to a reference by creating an Integer object
        Integer reference = new Integer(value);

        // Now the reference variable points to an object containing the value
        System.out.println("Value: " + value);
        System.out.println("Reference: " + reference);

        // Updating the value using the reference
        reference = reference + 5;

        // The value of 'value' doesn't change because it's a primitive type
        System.out.println("Value: " + value);
        System.out.println("Reference: " + reference);
    }
}
