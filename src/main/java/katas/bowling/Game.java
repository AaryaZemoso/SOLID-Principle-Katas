package katas.bowling;

public class Game {

    private int rolls[];
    private int currentRoll;

    Game() {
        rolls = new int[21];
        currentRoll = 0;
    }

    void roll(int pinsKnocked) {
        rolls[currentRoll++] = pinsKnocked;
    }

    int score() {

        int _score = 0;
        int frameIndex = 0;

        for (int frame = 0; frame < 10; frame++) {

            if (isStrike(frameIndex)) {
                _score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                frameIndex ++;
            }

            else if (isSpare(frameIndex)) {
                _score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            }

            else {
                _score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }

            System.out.println(_score);
        }

        return _score;
    }

    private boolean isSpare (int frameIndex) {
        return (rolls[frameIndex] + rolls[frameIndex + 1]) == 10;
    }

    private boolean isStrike (int frameIndex) {
        return rolls[frameIndex] == 10;
    }
}
