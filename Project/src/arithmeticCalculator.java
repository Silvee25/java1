import java.util.Scanner;

public class arithmeticCalculator {

	public static void main(String[] args) {
		int num1;
        int num2;
        String operation;


       Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number");
        num1 = sc.nextInt();

        System.out.println("please enter the second number");
        num2 = sc.nextInt();
       
        
        System.out.println("Please enter operation");
        operation = sc.next();
        
        if (operation.equals("+"))
        {
            System.out.println("your answer is" + (num1 + num2));
        }
        else if  (operation.equals("-"))
        {
            System.out.println("your answer is" + (num1 - num2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("your answer is" + (num1 * num2));
        }
        else if (operation.equals("/"))
        {
            System.out.println("your answer is" + (num1 / num2));
        }
        else
        {
        	System.out.println("default");
        }

	}

}
