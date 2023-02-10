import java.util.Scanner;

public class CountFlips {
	
		   //-----------------------------------------------------------------
		   //  Flips a coin multiple times and counts the number of heads
		   //  and tails that result.
		   //-----------------------------------------------------------------
		   public static void main (String[] args)
		   {
		      final int FLIPS = 50000;
		      double heads = 0, tails = 0; //use double type
		      System.out.println("Enter the Probability of Head :");
		      Scanner sc = new Scanner(System.in);
		      double headProb = sc.nextDouble();//Get Probability of Head side
           
		      UnfairCoin myCoin = new UnfairCoin((double)headProb);

		      for (int count=1; count <= FLIPS; count++)
		      {
		         myCoin.flip(); //get face value

		         if (myCoin.isHeads())
		            heads++;
		         else
		            tails++;
		      }

		      System.out.println ("Number of flips: " + FLIPS);
		      System.out.println ("Number of heads: " + heads);
		      System.out.println ("Number of tails: " + tails);
		      
		}
}