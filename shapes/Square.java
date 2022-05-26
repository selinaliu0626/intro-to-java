public class Square extends Shape{

    private double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public String toString() {
        return getColor()+" Square with side length of "+length+" and area of "+area();
    }
}
