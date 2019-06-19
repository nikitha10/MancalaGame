public class Game
{
    private Player one, two;
    private final int goal1 = 0; 
    private final int goal2 = 7; 
    private boolean donePlaying; 
    private Player currentPlayer; 
    private int numStones, stonesGoal1, stonesGoal2;
    private Integer[] board = new Integer[14];

    public Game(Player one, Player two)
    {
        this.one = one;
        this.two = two;
        this.currentPlayer = one; 
    }
    
    //"greys out" invalid first piles choices"
    public void possibleMoves()
    {
        //grey out any empty spaces
        if (currentPlayer.equals(one))
        {
            //grey out two goals and spaces 8 - 13
        }
        else 
        {
            //grey out two gaols and spaces 1 - 6
        }
    }
    
    //returns false when turn is over
    public boolean takeTurn(int firstPile)
    {   
        int notMyGoal, myGoal = -1; 
        int stonesInFirstPile = board[firstPile];
        if (currentPlayer.equals(one))
        {
            myGoal = goal1; 
            notMyGoal = goal2; 
        }
        else
        {
            myGoal = goal2; 
            notMyGoal = goal1; 
        }

        int lastIndex = 0; 
        for (int i = firstPile; i <= stonesInFirstPile; i++)
        {
            if (i != notMyGoal)
            {
                board[i + 1]++;
                lastIndex = i + 1; 
            }
        } 
        
        if (lastIndex == myGoal) //if we ended up in myGoal
        {
            takeTurn(lastIndex);
        }

        if (board[lastIndex] == 1) //return false and change player
        {
            if (currentPlayer.equals(one)
            {
                currentPlayer = two; 
            }
            else
            {
                currentPlayer = one; 
            }
            return false; 
        }
        else 
        {
            takeTurn(lastIndex); 
        }
    }

    public void resetGame()
    {
        currentPlayer = one; 
        //reset stones in each space
        for (int i = 0; i < board.length; i++)
        {
            if (i == goal1 || i == goal2)
            {
                board[i] = 0; 
            }
            else
            {
                board[i] = 4; 
            }
        }
    }

    public boolean gameIsOver()
    {
        int eachSpace, sumOfSpaces = 0;

        for (int i = 0; i < board.length; i++)
        {
            if (!((i == goal1) || (i == goal2)))
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
                System.out.println("It's a tie!");
        }
        return 0;
    }
}