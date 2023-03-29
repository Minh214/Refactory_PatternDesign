public class Square extends Shape {
    public Square(double side) {
        super(Math.pow(side, 2.0));
    }


    public String getType() {
        return "Square";
    }
}
