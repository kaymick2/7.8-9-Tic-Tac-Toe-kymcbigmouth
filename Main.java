import java.util.*;

/**
 * This program runs a TicTacToe game. It prompts the user to set positions on
 * the board and prints out the result.
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String player = "x";
    TicTacToe game = new TicTacToe();
    boolean done = false;
    while (!done) {
      System.out.print(game.toString());
      System.out.print("Row for " + player + " (-1 to exit): ");
      int row = (in.nextInt() - 1);
      if (row < 0)
        done = true;
      else {
        System.out.print("Column for " + player + ": ");
        int column = (in.nextInt() - 1);
        if (row < 0) {
          System.out.println(game.getWinner());
          done = true;
        } else if (game.getWinner().equals("x wins! how you didn't tie the game, i have no idea.")
            || game.getWinner().equals("o wins! lmao how did you not tie it")) {
          System.out.println(game.getWinner());
          done = true;
        } else {
          System.out.print("Column for " + player + ": ");
          column = ((in.nextInt()) - 1);

          if (column == -1) {
            System.out.println(game.getWinner());
          }
          do {
            System.out.println("someone already made a move here. Try again.");
            System.out.print("Row for " + player + " (-1 to exit): ");
            row = (in.nextInt() - 1);
            System.out.print("Column for " + player + ": ");
            column = (in.nextInt() - 1);
          } while (game.occupied(row, column, player) == true);
          game.set(row, column, player);
          if (player.equals("x"))
            player = "o";
          else
            player = "x";
        }
      }

    }
    in.close();
  }
}
