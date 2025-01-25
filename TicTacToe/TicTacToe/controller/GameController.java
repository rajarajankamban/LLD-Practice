package TicTacToe.controller;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        try {
            return Game.getBuilder().setSize(size).setPlayers(players).setWinningStrategies(winningStrategies).build();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Sorry. Invalid input. Please try to start game again.");
        }

        return null;
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void display(Game game) {
        game.displayBoard(game.getBoard());
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}
