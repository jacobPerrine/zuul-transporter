package src;

/**
 * A class for storing details of a particular item, including it's
 * description and it's weight; part of the "Summer Swing" application.
 *
 * @author Jacob Perrine
 * @version 2017.07.17
 */

public class Item
{
    private String description;
    private int weight;

    /**
     * Constructor for objects of class Item
     * 
     * @param description What an Item is or does
     * @param weight The integer weight of an Item (in lbs)
     */
    public Item(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * @return A String containing the weight and description of
     *         an Item object
     *         ex. A small brown briefcase.
     *             Item weight: 3 lbs
     */
    public String getItemDetails()
    {
        return description + ".\n" + "Item weight: " + weight + " lbs";
    }
}
