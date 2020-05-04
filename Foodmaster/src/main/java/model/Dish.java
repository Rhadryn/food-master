package model;

import java.util.Date;

/**
 * Represents a kind of food, the result of a recipe
 * It is used as a menu item
 * @author Joshua Bryant
 */
public class Dish {
    /**Contains the types of dishes*/
    public static enum dishType{
        UNDEFINED,      //For debug or placeholder purposes
        APPETIZER,      //The dish is a good for starting
        ENTREE,         //The dish is the main portion of a meal
        SIDE,           //The dish is smaller and supports others
        ONEDISH,        //The dish needs no accompaniment
        DESSERT         //The dish is sweet
    }
    
    //FUNDAMENTAL DATA
    /**Name of the dish*/
    private String name;
    /**Type of dish*/
    private dishType type;
    /**Link to the recipe url, if available*/
    private String recipeLink;
    
    //MENU-RELEVANT DATA
    /**Last time this dish was recorded as eaten*/
    private Date lastEaten;
    
    public Dish(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public dishType getType() {
        return type;
    }

    public void setType(dishType type) {
        this.type = type;
    }

    public String getRecipeLink() {
        return recipeLink;
    }

    public void setRecipeLink(String recipeLink) {
        this.recipeLink = recipeLink;
    }

    public Date getLastEaten() {
        return lastEaten;
    }

    public void setLastEaten(Date lastEaten) {
        this.lastEaten = lastEaten;
    }    
}
