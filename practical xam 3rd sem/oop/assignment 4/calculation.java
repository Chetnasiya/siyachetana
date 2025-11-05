import java.util.Scanner;
abstract class Shape{
    double length,breadth,base,height,rectArea,triArea;
    abstract void computer_area();
    
}
class Rectangle extends Shape{
    Rectangle(double l,double b){
    length=l;
    breadth=b;
    }
    void computer_area(){
        rectArea=length*breadth;
        System.out.println("Area of rectangle: "+rectArea);
    }
}
class Triangle extends Shape{
    Triangle(double bs,double h){
        base=bs;
        height=h;
    }
    void computer_area(){
        triArea=0.5*base*height;
        System.out.println("Area of rectangle: "+triArea);
    }
}
public class calculation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double l=sc.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double b=sc.nextDouble();
        System.out.println("Enter base of triangle");
        double bs=sc.nextDouble();
        System.out.println("Enter height of triangle");
        double h=sc.nextDouble();

        Shape r1=new Rectangle(l,b);
        Shape r2=new Triangle(bs,h);
        r1.computer_area();
        r2.computer_area();
    }
}