import java.util.Scanner;
interface Functions{
    public abstract void GearChange();
    public abstract void SpeedUp();
    public abstract void ApplyBreaks();
}
class Bicycle implements Functions{

    public void GearChange() {
        // System.out.println("gearChange method of Bicycle");
    }
    public void SpeedUp() {
        // System.out.println("speedUp method of Bicycle");
    }
    public void ApplyBreaks() {
        // System.out.println("applyBreaks method of Bicycle");
    }

    
}
class Car implements Functions{

    public void GearChange() {
        // System.out.println("gearChange method of car");
    }
    public void SpeedUp() {
        // System.out.println("speedUp method of car");
    }
    public void ApplyBreaks() {
        // System.out.println("applyBreaks method of car");
    }

    
}
class Bike implements Functions{

    public void GearChange() {
        // System.out.println("gearChange method of bike");
    }
    public void SpeedUp() {
        // System.out.println("speedUp method of bike");
    }
    public void ApplyBreaks() {
        // System.out.println("applyBreaks method of bike");
    }
    
}
public class Vehicles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter bicycle gear");
            int BicycleGear=sc.nextInt();
            System.out.println("enter bicycle speed");
            int BicycleSpeed=sc.nextInt();
            System.out.println("whether bicycle need to stop or start(enter 1 for start and 0 for stop)");
            int BicycleBreak=sc.nextInt();
            
            System.out.println("enter car gear");
            int CarGear=sc.nextInt();
            System.out.println("enter car speed");
            int CarSpeed=sc.nextInt();
            System.out.println("whether car need to stop or start(enter 1 for start and 0 for stop)");
            int CarBreak=sc.nextInt();
            
            System.out.println("enter bike gear");
            int BikeGear=sc.nextInt();
            System.out.println("enter bike speed");
            int BikeSpeed=sc.nextInt();
            System.out.println("whether bike need to stop or start(enter 1 for start and 0 for stop)");
            int BikeBreak=sc.nextInt();
            
    }
        Bicycle b1 =new Bicycle();
        b1.GearChange(BicycleGear);
        b1.SpeedUp();
        b1.ApplyBreaks();
        Car c1 =new Car();
        c1.GearChange();
        c1.SpeedUp();
        c1.ApplyBreaks();
        Bike b =new Bike();
        b.GearChange();
        b.SpeedUp();
        b.ApplyBreaks();
    }
