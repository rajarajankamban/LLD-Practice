package TicTacToe.models;

public class Cell {
    private int row;
    private int column;
    private Symbol symbol;
    private CellState state;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.symbol = null;
        this.state = CellState.EMPTY;
    }

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void displayCell() {
        if (state.equals(CellState.EMPTY)) {
            System.out.print("| - |");
        } else {
            System.out.print("| " + symbol.getValue() + " |");
        }
    }
}
