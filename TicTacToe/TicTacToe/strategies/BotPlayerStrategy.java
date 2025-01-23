package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface BotPlayerStrategy {

    public Move makeMove(Board board);
}
