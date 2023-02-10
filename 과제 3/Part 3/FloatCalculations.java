import java.util.Scanner;

public class FloatCalculations {
	 public static void main(String [] args){
		    Scanner sc = new Scanner(System.in);
		    //Use Scanner to get two numbers
		    System.out.print("Enter the first number : ");
		    float num1=sc.nextFloat();
		    System.out.print("Enter the Second number : ");
		    float num2=sc.nextFloat();
		    //Make Object name Cal by MyCalculatorProd
		    //use doAll method for printing out the result
		    MyCalculatorProd Cal = new MyCalculatorProd(num1,num2);
		    Cal.doAll();
		}

}

}