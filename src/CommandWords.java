package src;

/**
 * This class is part of the "Summer Swing" application, a modification
 * based off the "World of Zuul" application, a very simple text based
 * adventure game by David J. Barnes and Michael Kölling.
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kölling, David J. Barnes, and Jacob Perrine
 * @version 2017.07.17
 * 
 * @modifications
 * - last updated v2017.07.17; see changelog
 */

public class CommandWords
{
    // a constant array that holds all valid command words
    private static final String[] validCommands = {
        "go", "quit", "help", "look", "time"
    };

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word.
     * 
     * @return true if a given string is a valid command,
     *         false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }
    
    /**
     * @return A String containing the names of the valid commands
     */
    public String getCommandList()
    {
        String result = "";
        
        for(String command: validCommands) {
            result = result + command + " ";
        }
        
        return result;
    }
}
