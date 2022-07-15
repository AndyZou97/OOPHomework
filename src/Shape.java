public class Shape {
    public boolean isFilled;
    public String color;

    public Shape(){
        this.isFilled = true;
        this.color = "Green";
    }
    public Shape(boolean isFilled, String color){
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean getIsFilled(){

        return this.isFilled;
    }
    public String getColor(){
        return this.color;
    }
    public void setIsFilled(boolean isFilled){
        this.isFilled = isFilled;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Filled: " + this.isFilled + "\n" + "Color: " + this.color;
    }

}
