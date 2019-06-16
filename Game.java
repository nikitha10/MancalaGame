
public class Game
{
    private Player one, two;
    private int numStones, stonesGoal1, stonesGoal2;
    private Integer[] board = new Integer[14];
    
    public Game(Player one, Player two)
    {
        this.one = one;
        this.two = two;
    }
    
    public boolean gameIsOver()
    {
        int eachSpace, sumOfSpaces = 0;

        for (int i = 0; i < board.length; i++)
        {
            if (!(((i == 0) || (i == 13))))
            {
                eachSpace = board[i];
                sumOfSpaces += eachSpace;
            }
        }

        if ((sumOfSpaces == 0) 
        || (stonesGoal1 > sumOfSpaces + stonesGoal2)
        || (stonesGoal2 > sumOfSpaces + stonesGoal1))
            return true;

        return false;
    }

    public int determineWinner()
    {
        if (gameIsOver())
        {
            if (stonesGoal1 > stonesGoal2)
            { 
                System.out.println("Player 1 wins!");
                return 1;
            }

            else if (stonesGoal2> stonesGoal1)
            {
                System.out.println ("Player 2 wins!");
                return 2; 
            }
            else
                System.out.println("It�s a tie!");
        }
        return 0;
    }
}
