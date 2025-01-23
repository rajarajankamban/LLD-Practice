package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private Integer nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

    private Game(Integer size, List<Player> players, List<WinningStrategy> winningStrategies) {
        board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.moves = new ArrayList<>();
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void displayBoard(Board board) {
        board.display();
    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }

    public static class GameBuilder {
        private List<Player> players;
        private Board board;
        private Integer nextPlayerIndex;
        private GameState gameState;
        private List<Move> moves;
        private List<WinningStrategy> winningStrategies;
        private Player winner;
        private int size;

        public Game build() {
            return new Game(this.size, this.players, this.winningStrategies);
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder setNextPlayerIndex(Integer nextPlayerIndex) {
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public GameBuilder setGameState(GameState gameState) {
            this.gameState = gameState;
            return this;
        }

        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public GameBuilder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public GameBuilder setSize(int size) {
            this.size = size;
            return this;
        }


        // No of players = size - 1
        // All players should have distinct symbol
        // We only have at max One Bot
        private void validate() {
        }

    }
}
