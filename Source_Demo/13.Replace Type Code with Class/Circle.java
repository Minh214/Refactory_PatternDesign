public class Circle extends Shape {
    public Circle(double radius) {
        super(Math.PI * Math.pow(radius, 2.0));
    }


    public String getType() {
        return "Circle";
    }
}
