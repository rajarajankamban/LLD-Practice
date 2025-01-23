package TicTacToe.controller;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        return Game.getBuilder().setSize(size).setPlayers(players).setWinningStrategies(winningStrategies).build();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void display(Game game) {
        game.displayBoard(game.getBoard());
    }

    public void makeMove(Game game) {
    }

    public Player getWinner(Game game) {
        return null;
    }
}
