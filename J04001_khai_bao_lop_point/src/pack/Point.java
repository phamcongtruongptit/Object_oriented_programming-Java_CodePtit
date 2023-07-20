package pack;

public class Point {
    private double x , y   ; 
    public Point(){

    }
    public Point(double x, double y){
        this.x = x; 
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x ; 
        this.y = p.y ; 
    }

    public double getX(){
        return this.x ;
    }
    public double getY(){
        return this.y ;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) ; 
    }
    
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x , 2) + Math.pow(p1.y - p2.y , 2 )) ; 
    }

    public String toString(){
        return x+ " " + y; 
    }
}
