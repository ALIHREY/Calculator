
package alihcalculator;

import java.util.Scanner;
public class ALIHCalculator {

   
    public static void main(String[] args) {
      Scanner ob = new Scanner (System.in);
      
        System.out.println("input first number");
        int num1 = ob.nextInt();
        System.out.println("input second number");
        int num2 = ob.nextInt();
        
        System.out.println(num1 + "+" +num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" +num2 + "=" + (num1 - num2));
        System.out.println(num1 + "X" +num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" +num2 +  "=" + (num1 / num2));
    }
    
}
