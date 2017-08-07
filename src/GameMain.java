package src;

/**
 * Main launching point for the Summer Swing application.
 *
 * @author Jacob Perrine
 * @version 2017.07.17
 */
public class GameMain
{
    /**
     * Main argument to launch the program.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args)
    {
        Game game = new Game();
        game.play();
    }
}
