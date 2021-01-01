import java.util.Scanner;

/**
   This program runs a TicTacToe game. It prompts the
   user to set positions on the board and prints out the
   result.
*/
public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String player = "x";
      TicTacToe game = new TicTacToe();
      boolean done = false;
      while (!done)
      {
         System.out.print(game.toString()); 
         System.out.print(
               "Row for " + player + " (-1 to exit): ");
         int row = (in.nextInt()-1);
         if (row < 0) done = true;
         else
         {
            System.out.print("Column for " + player + ": ");
            int column = (in.nextInt()-1);
            game.set(row, column, player);
            if (player.equals("x")) 
               player = "o"; 
            else 
               player = "x";    
         }
      }  in.close();
   }
}
