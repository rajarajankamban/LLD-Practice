package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character, Integer>> rowCounts;

    public RowWinningStrategy() {
        rowCounts = new HashMap<>();
    }

    @Override
    public Boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getCell().getSymbol();

        if (!rowCounts.containsKey(row)) {
            rowCounts.put(row, new HashMap<>());
        }

        HashMap<Character, Integer> counts = rowCounts.get(row);
        if (!counts.containsKey(symbol.getValue())) {
            counts.put(symbol.getValue(), 0);
        }

        counts.put(symbol.getValue(), counts.get((symbol.getValue())) + 1);

        if (counts.get(symbol.getValue()) == (board.getSize())) {
            return true;
        }

        return false;
    }
}
