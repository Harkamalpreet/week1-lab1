import java.util.Scanner;
public class addition {
public static void main(String[] args)
{
	// too- auto generated stab
	
	Scanner input = new Scanner(System.in);
	int num1;
	int num2;
	int sum;
	System.out.print("enter the first integer");
	num1 = input.nextInt();
	System.out.print("enter the second integer");
	num2 = input.nextInt();
	
	sum = num1 +num2;
	
	System.out.printf("sum is %d%n",sum);
}
}
