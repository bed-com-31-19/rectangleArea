import java.util.Scanner;
public class rectangleArea {
    public static void main(String[] args) {
        System.out.println("the area will be shown here");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = input.nextDouble();

        System.out.println("Enter breadth: ");
        double breadth = input.nextDouble();

        Area area1 = new Area(length,breadth);
        System.out.println("The area is " + area1.returnArea());

    }
}
class Area {
    double length;
    double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double returnArea() {
        return (length * breadth);
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setLength() {
        this.length = length;
    }
    public void setBreadth() {
        this.breadth = breadth;
    }
}

