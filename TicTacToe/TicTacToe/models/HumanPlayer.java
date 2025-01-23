package TicTacToe.models;

public class HumanPlayer extends  Player{
    private Integer level;
    private Integer coins;

    public HumanPlayer(String id, String name, Symbol symbol) {
        super(id, name, symbol, PlayerType.HUMAN_PLAYER);
        this.level = 1;
        this.coins = 0;
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
}
