package TicTacToe;

import TicTacToe.controller.GameController;
import TicTacToe.models.BotPlayer;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        // Things required to start game
        // Size of the board
        // number of players
        // list of players
        // list of winning strategies
        List<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new BotPlayer());
        int size = 3;
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        gameController.startGame(size, players, winningStrategies);

        while (gameController.getGameState().equals(GameState.IN_PROGRESS)) {
            gameController.display();
            gameController.makeMove();
        }

        if (gameController.getGameState().equals(GameState.SUCCESS)) {
            System.out.println("Winner:" + gameController.getWinner().getName());
        } else if (gameController.getGameState().equals(GameState.DRAW)) {
            System.out.println("Game ended in draw");
        }
    }
}


// start game
// create players
// display
// ask current player to make move
// check for winner OR draw
//   IF yes game over -> change game state
//   else game continue

// Makemove
// Take input
// check winner or draw
// update game state if required
// update turn