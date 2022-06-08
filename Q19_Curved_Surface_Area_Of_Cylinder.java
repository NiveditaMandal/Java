import java.util.*;
public class Q19_Curved_Surface_Area_Of_Cylinder{
    public static void main(String[] args){
        // Curved Surface Area of cube
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double h= sc.nextDouble();
        double curvedSurfaceArea = 2*Math.PI*r*h;
        System.out.println("Curved Surface Area Of Cylinder is " + curvedSurfaceArea);
        in.close();
        
    }
}
