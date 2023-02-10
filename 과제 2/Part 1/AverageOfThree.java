import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int num1= sc.nextInt();
		System.out.print("Enter the second number :");
		int num2=sc.nextInt();
		System.out.print("Enter the third number :");
		int num3=sc.nextInt();
		double avg = (double)(num1+num2+num3)/3;
		System.out.println("The average of three numbers is "+avg);

	}

}
