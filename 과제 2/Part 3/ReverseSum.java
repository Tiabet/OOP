import java.util.Scanner;

public class ReverseSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the positive integer A :");
		int numA=sc.nextInt();
		String numstr=String.valueOf(numA);
		int numB=0;
		for (int i=0;i<numstr.length();i++) {
			char digit =numstr.charAt(numstr.length()-i-1)-48;
			numB=numB*10+digit;
		}
		System.out.println("That number reserved is "+numB);
		System.out.println("The sum of two numbers is "+(numA+numB));
	
	}

}
