public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return getColor()+" Circle with radius of "+radius+" and area of "+this.area();
    }
}
