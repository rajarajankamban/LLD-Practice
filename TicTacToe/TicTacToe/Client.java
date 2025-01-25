package TicTacToe;

import TicTacToe.controller.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.ColumnWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;
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
        players.add(new HumanPlayer("1", "Rajan", new Symbol('R')));
//        players.add(new HumanPlayer("2", "Anu", new Symbol('X')));
        players.add(new BotPlayer("2", "BOTT", new Symbol('O'), BotDifficultyLevel.EASY));
        int size = 3;
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        Game game = gameController.startGame(size, players, winningStrategies);

        while (gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {


            gameController.makeMove(game);
            gameController.display(game);
            if (game.getGameState().equals(GameState.IN_PROGRESS))
                gameController.undo(game);

        }

        if (gameController.getGameState(game).equals(GameState.SUCCESS)) {
            System.out.println("Winner:" + gameController.getWinner(game).getName());
        } else if (gameController.getGameState(game).equals(GameState.DRAW)) {
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