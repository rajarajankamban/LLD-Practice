package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;

import java.util.List;

public class EasyBotPlayerStrategy implements BotPlayerStrategy {
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getGrid()) {
            for (Cell cell : row) {
                if (cell.getState().equals(CellState.EMPTY)) {
//                    return new Move(cell, null);
                    return new Move(new Cell(cell.getRow(), cell.getRow()), null);
                }
            }
        }
        return null;
    }
}


// Easy - read cells one by one and fill of its empty
// Medium - Use random and fill the cell
// Hard - use backtracking for winning and fill the cell