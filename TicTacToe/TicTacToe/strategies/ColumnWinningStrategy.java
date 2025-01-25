package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character, Integer>> columnCounts;

    public ColumnWinningStrategy(){
        columnCounts = new HashMap<>();
    }
    @Override
    public Boolean checkWinner(Board board, Move move) {
        int column = move.getCell().getColumn();
        Symbol symbol = move.getCell().getSymbol();

        if (!columnCounts.containsKey(column)) {
            columnCounts.put(column, new HashMap<>());
        }

        HashMap<Character, Integer> counts = columnCounts.get(column);
        if (!counts.containsKey(symbol.getValue())) {
            counts.put(symbol.getValue(), 0);
        }

        counts.put(symbol.getValue(), counts.get((symbol.getValue())) + 1);

        if (counts.get(symbol.getValue()).equals(board.getSize())) {
            return true;
        }

        return false;
    }
}
