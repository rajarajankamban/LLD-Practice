package TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Integer level;
    private Integer coins;
    private Scanner scanner;

    public HumanPlayer(String id, String name, Symbol symbol) {
        super(id, name, symbol, PlayerType.HUMAN_PLAYER);
        this.level = 1;
        this.coins = 0;
        this.scanner = new Scanner(System.in);
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Enter Row : ");
        int row = scanner.nextInt();
        System.out.println("Enter Column: ");
        int column = scanner.nextInt();

        return new Move(new Cell(row, column), this);
    }
}
