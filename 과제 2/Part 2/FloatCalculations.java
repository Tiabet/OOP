import java.util.Scanner;

public class FloatCalculations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		float num1 = sc.nextFloat();
		System.out.print("Enter the second number :");
		float num2 = sc.nextFloat();
		float sum = num1+num2;
		float sub = num1-num2;
		float mul = num1*num2;
		System.out.println("The sum of two numbers is "+sum);
		System.out.println("The substraction of two numbers is "+sub);
		System.out.println("The multiplication of thw numbers is "+mul);
	}

}
