

public class Shape {
   String color;
   Boolean isFilled;

    public Shape(){
        this.color = "unknown";
        this.isFilled = false;
    }
    public Shape(String color, Boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getIsFilled(){
        return this.isFilled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setIsFilled(boolean isFilled){
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getIsFilled();

    }
}

