package TicTacToe.strategies;

import TicTacToe.models.*;

import java.util.List;

public class EasyBotPlayerStrategy implements BotPlayerStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        for (List<Cell> row : board.getGrid()) {
            for (Cell cell : row) {
                if (cell.getState().equals(CellState.EMPTY)) {
//                    return new Move(cell, null);
                    System.out.println("Bot Move " + cell.getRow() + " " + cell.getColumn());
                    return new Move(new Cell(cell.getRow(), cell.getColumn()), player);
                }
            }
        }
        return null;
    }
}


// Easy - read cells one by one and fill of its empty
// Medium - Use random and fill the cell
// Hard - use backtracking for winning and fill the cell