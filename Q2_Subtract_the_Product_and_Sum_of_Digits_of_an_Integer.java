//Subtract the Product and Sum of Digits of an Integer
//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//Input: n = 234
//Output: 15 
//Explanation: 
//Product of digits = 2 * 3 * 4 = 24 
//Sum of digits = 2 + 3 + 4 = 9 
//Result = 24 - 9 = 15





import java.util.Scanner;

public class Q2_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            int sum = 0;
            int product = 1;

            while(num > 0) {
                int rem = num % 10;
                sum += rem;
                product *= rem;
                num /= 10;

            }
            System.out.println(product-sum);

        }
    }
