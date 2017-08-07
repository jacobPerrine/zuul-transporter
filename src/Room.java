package src;

import java.util.HashMap;
import java.util.Set;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "Summer Swing" application, a modification
 * based off the "World of Zuul" application, a very simple text based
 * adventure game by David J. Barnes and Michael Kölling. 
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling, David J. Barnes and Jacob Perrine
 * @version 2017.07.17
 * 
 * @modifications
 * - last updated v2017.07.17; see changelog
 */

public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
    private Item item;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * 
     * @param description The room's description
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
        item = null;
    }
    
    /**
     * Define an item for the Room to hold.
     * 
     * @param description The verbose description of the item
     * @param weight The integer weight of the item
     */
    public void setItem(Item item)
    {
        this.item = item;
    }

    /**
     * Define an exit from the Room.
     * 
     * @param direction The direction of the exit
     * @param neighbor The room to which the exits leads
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * @return The Room that exists in the direction passed as a parameter to
     *         this method, or null if none exists.
     *         
     * @param direction The exits direction
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
    
    /**
     * @return A description of the available exits.
     * ex. "Exits: north west"
     */
    public String getExitString()
    {
        String returnString = "Exits: ";
        Set<String> keys = exits.keySet();
        for(String exit: keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
    /**
     * @return A description of the room, including exits, as well
     *         as item information if applicable
     *         ex. You are in the kitchen.
     *             Exits: north west
     *             any item description
     */
    public String getLongDescription()
    {
        String result = "You are " + description + ".\n"
                        + getExitString();
        
        if(item != null) {
            result = result + "\n" + "There's an item: "
                     + item.getItemDetails();
        }
        
        return result;
    }
}
