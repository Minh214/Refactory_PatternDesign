public class Example {
    private static final int TWO = 2;

    public static void main(String[] args) {
        double radius = 5;
        double circumference = TWO * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circle with radius " + radius);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}