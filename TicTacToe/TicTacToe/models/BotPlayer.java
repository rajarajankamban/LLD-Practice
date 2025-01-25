package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(String id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }


    @Override
    public Move makeMove(Board board) {
        return BotPlayingStrategyFactory.getBotPlayerStrategy(botDifficultyLevel).makeMove(board, this);
    }
}
