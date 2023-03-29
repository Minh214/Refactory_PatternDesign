public class Main {
    public static void main(String[] args) {
        // Creating an Integer object
        Integer reference = new Integer(10);

        // Changing the reference to a value by retrieving the int value from the object
        int value = reference.intValue();

        // Now 'value' is equal to the value contained in the object
        System.out.println("Value: " + value);
        System.out.println("Reference: " + reference);

        // Updating the value doesn't affect the reference
        value = value + 5;

        System.out.println("Value: " + value);
        System.out.println("Reference: " + reference);
    }
}
