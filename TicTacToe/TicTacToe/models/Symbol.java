package TicTacToe.models;

public class Symbol {
    private Character value;

    public Symbol(Character value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
