public class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
        this.isFilled = false;
    }
    public Circle(double radius, boolean isFilled, String color){
        super(isFilled,color);
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)* 3.14;
    }
    @Override
    public String toString(){
        return "Radius: " + this.radius + "\n" + "Area: " + this.getArea() + "\n" + "Filled: " + this.getIsFilled() + "\n" + "Color: " + this.getColor();
    }
}
