package TicTacToe.strategies;

import TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayerStrategy getBotPlayerStrategy(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayerStrategy();
        }

        return null;
    }
}
