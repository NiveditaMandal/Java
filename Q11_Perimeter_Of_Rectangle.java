import java.util.Scanner;
public class  Q11_Perimeter_Of_Rectangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lenght of rectangle: ");
        float rect_len = in.nextFloat();
        System.out.println("enter the width of rectangle: ");
        float rect_wid = in.nextFloat();
        System.out.println("ans is: " + 2*(rect_len + rect_wid));
    }
}
