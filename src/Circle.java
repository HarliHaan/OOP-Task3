public class Circle extends Shape{

    int radius;

    public Circle(){
        this.color = "unknown";
        this.isFilled = false;
        this.radius = 1;
    }
    public Circle(String color, boolean isFilled, int radius){
        this.color = color;
        this.isFilled = isFilled;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private int getArea(){
        return radius * radius * (int)Math.PI;
    }
    private int getPerimeter(){
        return 2 * (int)Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle with radius = " + radius + " which is a subclass off " + super.toString();
    }

}
