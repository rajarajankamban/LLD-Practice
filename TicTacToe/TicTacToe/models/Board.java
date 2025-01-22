package TicTacToe.models;

import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    private Integer size;

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
