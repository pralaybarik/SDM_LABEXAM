import java.util.Scanner;

public class JavaProgram{
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 =sc.nextDouble();;
        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();;

        double sum = num1 + num2 + num3 ;

         System.out.println("The sum of the largest number is " + sum);

         sc.close();

        



        
        
    }
}
