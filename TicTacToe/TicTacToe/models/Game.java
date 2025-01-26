package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Game {
    private List<Player> players;
    private Board board;
    private Integer nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;
    private static Scanner scanner;

    private Game(Integer size, List<Player> players, List<WinningStrategy> winningStrategies) {
        board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.scanner = new Scanner(System.in);
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

    public void undo() {

        // Fix undo winning strategy
        Integer currentPlayerIndex = nextPlayerIndex - 1 < 0 ? players.size() -1 : nextPlayerIndex - 1;
        if (players.get(currentPlayerIndex).getPlayerType().equals(PlayerType.BOT)) {
            return;
        }
        System.out.println("Do you wish to UNDO ? Y/N");
        Boolean isUndo = scanner.nextBoolean();
        if (!isUndo || moves.isEmpty()) {
            return;
        }
        Move move = moves.removeLast();
        Integer row = move.getCell().getRow();
        Integer column = move.getCell().getColumn();
        Cell cell = board.getGrid().get(row).get(column);
        cell.setSymbol(new Symbol(null));
        cell.setState(CellState.EMPTY);


        nextPlayerIndex = currentPlayerIndex;

        // Pop last move from moves
        // Reset cell from board based on last move
        // Reset the player to last one
    }

    public void displayBoard(Board board) {
        board.display();
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It's " + currentPlayer.getName() + " turn.");
        Move move = currentPlayer.makeMove(board);
        if (!validateMove(move)) {
            System.out.println("Invalid move please try again");
            return;
        }

        updateGameMove(move, currentPlayer);


        nextPlayerIndex++;
        nextPlayerIndex = nextPlayerIndex % players.size();

        if (checkWinner(move)) {
            winner = currentPlayer;
            gameState = GameState.SUCCESS;
        } else if (moves.size() == board.getSize() * board.getSize()) {
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Move move) {
        for (WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    private void updateGameMove(Move move, Player currentPlayer) {
        Integer row = move.getCell().getRow();
        Integer column = move.getCell().getColumn();

        Cell cellToChange = board.getGrid().get(row).get(column);

        cellToChange.setState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        move.setPlayer((currentPlayer));
        moves.add(move);
    }


    private boolean validateMove(Move move) {
        Integer row = move.getCell().getRow();
        Integer column = move.getCell().getColumn();
        if (row < 0 || row >= board.getSize() || column < 0 || column >= board.getSize()) {
            return false;
        }

        return board.getGrid().get(row).get(column).getState().equals(CellState.EMPTY);
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
            this.validateGame();
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

        // Throw exception  and catch it in controller
        private void validateGame() {
            Boolean isValid = false;
            if (players.size() >= size) {
                throw new ArithmeticException("Mismatch between number of players and board size ");
            }

            HashSet<Character> symCharSet = new HashSet<>();
            AtomicReference<Boolean> isBotFount = new AtomicReference<>(false);

            for (Player player : players) {
                if (symCharSet.contains(player.getSymbol().getValue())) {
                    throw new RuntimeException("Duplicate player symbol");

                }
                symCharSet.add(player.getSymbol().getValue());

                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    if (isBotFount.get()) {
                        throw new RuntimeException("Only one BOT player is allowed");
                    }
                    isBotFount.set(true);
                }


            }

        }

    }
}
