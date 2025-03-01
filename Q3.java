/*Q3. Write a Java program that defines a Point class with attributes X and Y, and includes a
parameterized constructor to initialize these attributes. Implement a copy
constructor to create a new point object with the same attribute values. Ensure that
modifications made to one object do not affect the other. Utilize getter and setter
methods to retrieve and update the attribute values. */
class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(p1);
        System.out.println("Initial Details of p1 & p2: "+p1.getX()+" "+p1.getY()+" "+p2.getX()+" "+p2.getY());
        p2.setX(30);
        p2.setY(40);
        System.out.println("Updated Details of p2: "+p2.getX()+" "+p2.getY());
    }
}