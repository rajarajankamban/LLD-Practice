package TicTacToe.strategies;

public class ColumnWinningStrategy implements  WinningStrategy{
    @Override
    public void checkWinner() {
        System.out.println("Column winner checking");
    }
}
