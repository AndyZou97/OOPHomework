public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        setLW(2,1);
    }
    public Rectangle(double width, double length){
        setLW(width,length);
    }
    public Rectangle(double width, double length, boolean isFilled, String color){
        super(isFilled, color);
        setLW(width,length);
    }
    public void setLW(double x, double y){
        if(x>y){
            this.length = x;
            this.width = y;
        }
        else{
            this.length = y;
            this.width = x;
        }
    }
    public double getArea(){
        return this.length*this.width;
    }

    @Override
    public String toString(){
        return "Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + this.getArea() + "\n" + "Filled: " + this.getIsFilled() + "\n" + "Color: " + this.getColor();
    }
}
