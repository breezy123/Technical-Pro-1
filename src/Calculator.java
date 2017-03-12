/**
 * Created by aubrey on 12/03/2017.
 */
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		int num1=0, num2=0, answer=0;
		char choice;
		Scanner keyIn = new Scanner(System.in);

		System.out.print("Choose one of the Calculations to Perform: \n1-addition, 2-subtraction ");
		System.out.print("3-division, 4-multiplication \n");
		choice = keyIn.next().charAt(0);

		if(choice == '1')
		{
			System.out.println("Please Enter First Number: ");
			num1 = keyIn.nextInt();
			System.out.println("Enter Second Number: ");
			num2 = keyIn.nextInt();

			answer = num1 + num2;
		}
		else if(choice =='2')
		{
			System.out.println("Please Enter First Number: ");
			num1 = keyIn.nextInt();
			System.out.println("Enter Second Number: ");
			num2 = keyIn.nextInt();

			answer = num1 - num2;
		}
		else if(choice =='3')
		{
			System.out.println("Please Enter First Number: ");
			num1 = keyIn.nextInt();
			System.out.println("Enter Second Number: ");
			num2 = keyIn.nextInt();

			if (num1 == 0 || num2 == 0) {
				System.out.println("Can't perform division by 0");
			} else {
				answer = num1 / num2;
			}
		}
		else if(choice =='4')
		{
			System.out.println("Please Enter First Number: ");
			num1 = keyIn.nextInt();
			System.out.println("Enter Second Number: ");
			num2 = keyIn.nextInt();

			answer = num1 * num2;
		}
		else
		{
			System.out.println("Invalid Selection Made...");
		}


		System.out.print("Answer is: " + answer);
	}
}
