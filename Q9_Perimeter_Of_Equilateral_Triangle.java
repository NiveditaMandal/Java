import java.util.*;
public class Q9_Perimeter_Of_Equilateral_Triangle{
    public static void main(String[] args){
        // perimeter of equilateral triangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a side of equilateral triangle: ");
        double side = scanner.nextDouble();
        System.out.println("The perimeter of the equilateral triangle is " + (3 * side) + ".");
        scanner.close();
    }
}
