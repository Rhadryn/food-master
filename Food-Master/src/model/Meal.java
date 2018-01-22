package model;

public class Meal {
	/**Name of meal*/
	private String name;
	/**Number of servings in the meal*/
	private int servings;
	/**Recipes used in the meal*/
	private Recipe[] recipes;
	/**Count of recipes in meal*/
	private int rcount;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the servings
	 */
	public int getServings() {
		return servings;
	}

	/**
	 * @param servings the servings to set
	 */
	public void setServings(int servings) {
		this.servings = servings;
	}
	
	/**
	 * Adds a recipe to the meal
	 * @param recipe recipe to add
	 */
	public void addRecipe(Recipe recipe) {
		recipes[rcount] = recipe;
		rcount++;
	}
}
