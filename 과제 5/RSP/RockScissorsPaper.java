package RSP;

import java.util.Scanner;

public class RockScissorsPaper {

    public static int HowManyRuns = 5;
    public static final int ROCK = 1;
    public static final int SCISSORS = 2;
    public static final int PAPER = 3;

    public static void main(String[] args) {
        int userScore = 0;
        int compScore = 0;
        int userMove, compMove;
        int winner;


        System.out.println("ROCK - PAPER - SCISSORS");
        System.out.println("This game plays "+ HowManyRuns + " rounds.");
        System.out.print("Enter Your Move");
        System.out.println("[ROCK <"+ROCK+">, SCISSORS <"+SCISSORS+">, PAPER <"+PAPER+">]");

        // Loop once for each round of the game.
        for (int rnd = 1; rnd <= RockScissorsPaper.HowManyRuns; rnd++) {

            // Get the moves for this round.
            userMove = getUserMove();
            compMove = getComputerMove();
            System.out.println("Computer's move: " + getMoveName(compMove));

            // Determine the winner of this round.
            winner = determineRoundWinner(compMove, userMove);

            // Print a message and add one to the score of the winner.
            if (winner == 1) {
                System.out.println(getMoveName(compMove) + " beats "
                        + getMoveName(userMove)
                        + " the computer wins this round.");
                compScore++;
            } else if (winner == -1) {
                System.out.println(getMoveName(userMove) + " beats "
                        + getMoveName(compMove)
                        + " the user wins this round.");
                userScore++;
            } else {
                System.out.println(getMoveName(userMove) + " ties "
                        + getMoveName(compMove)
                        + " nobody wins this round.");
            }

            System.out.println("Score: User=" + userScore
                    + " Computer=" + compScore);
            System.out.println();
        }

        // The ten rounds are over...
        // Print out the winner of the game.
        displayGameWinner(userScore, compScore);
    }


    /**
	* Change move numbers to appropriate string values
	* @return The appropriate string values for the moveNumber
	*/
	static String getMoveName(int moveNumber) {
            if(moveNumber == 1){
                return "ROCK";
            }else if(moveNumber==2){
                return "SCISSORS";
            }else{
                return "PAPER";
            }
    }


    /**
     * Read in a move from the user. Valid responses are Rock, Paper or
     * Scissors. Prompt until a valid move is entered.
     *
     * @return The user's move as one of: Rock, Paper, Scissors
     */
    static int getUserMove() {
        Scanner sc = new Scanner(System.in);
        int UMove = sc.nextInt();
        return UMove;

    }

    /**
     * Pick the computer's move at random.
     *
     * @return The computer's move as one of: Rock, Paper, Scissors
     */
    static int getComputerMove() {
        int CMove=randomInt(1,3);
        return CMove;
    }

    /**
     * Generate a random integer in the range [lowEnd...highEnd].
     *
     * @param lowEnd the low end of the range of possible numbers.
     * @param highEnd the high end of the range of possible numbers.
     * @return a random integer in [lowEnd...highEnd]
     */
    public static int randomInt(int lowEnd, int highEnd) {
        int num = (int)(Math.random()*highEnd+lowEnd);
        return num;
    }

    /**
     * Compare the user's move to the computer's move to determine the winner of
     * this round.
     *
     * @param userMove the user's move.
     * @param compMove the computer's move.
     * @return 1 if the computer wins. 0 if it is a tie. -1 if the user wins.
     */
    static int determineRoundWinner(int userMove,int compMove) {
        if(userMove-compMove==-1||userMove-compMove==2){
            return 1;
        }else if(userMove-compMove==1||userMove-compMove==-2){
            return -1;
        }else{
            return 0;
        }
    }

    /**
     * Display a message showing the score of the game and declaring the winner.
     *
     * @param userScore the user's score for the 10 rounds.
     * @param compScore the computer's score for the 10 rounds.
     */
    static void displayGameWinner(int userScore,int compScore) {

        System.out.println("\n\nFinal Score:");
        System.out.println("       User=" + userScore
                + "   Computer=" + compScore);
        System.out.println();

        if (userScore > compScore) {
            System.out.println("The user wins!");
        } else if (compScore > userScore) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Its a tie, nobody wins.");
        }
    }
}