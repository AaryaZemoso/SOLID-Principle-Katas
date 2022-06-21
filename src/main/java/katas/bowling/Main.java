package katas.bowling;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        // Frame 1
        game.roll(1);
        game.roll(4);

        // Frame 2
        game.roll(4);
        game.roll(5);

        // Frame 3
        game.roll(6);
        game.roll(4);

        // Frame 4
        game.roll(5);
        game.roll(5);

        // Frame 5
        game.roll(10);

        // Frame 6
        game.roll(0);
        game.roll(1);

        // Frame 7
        game.roll(7);
        game.roll(3);

        // Frame 8
        game.roll(6);
        game.roll(4);

        // Frame 9
        game.roll(10);

        // Frame 10
        game.roll(2);
        game.roll(8);
        game.roll(6);

        System.out.println(game.score());
    }
}
