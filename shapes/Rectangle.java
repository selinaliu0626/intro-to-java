public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return getColor()+" Rectangle with length of "+getLength()+" and width of "+getWidth()+ " and area of "+area();
    }
}
