public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int xVal, int yVal){
        this.x = xVal;
        this.y = yVal;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public String toString(){
        return ("(" + this.x + ", " + this.y + ")");
    }

    public double distance(Point p){
        int xdif = p.x - this.x;
        int ydif = p.y - this.y;
        return Math.sqrt((Math.pow(xdif,2) + Math.pow(ydif,2)));
    }
}
