public class Rectangle extends Shape{


    double width;
    double length;

    public Rectangle(){
        this.color = "unknown";
        this.isFilled = false;
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(String color, boolean isFilled, double width, double length){
        this.color = color;
        this.isFilled = false;
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    private double getArea(){
        return length * width;
    }
    private double getPerimeter(){
        return 2 * length + width;
    }

    @Override
    public String toString() {
        return "Rectangle with width= " + width + " and length= " + length + " which is a subclass off " + super.toString();
    }
}
