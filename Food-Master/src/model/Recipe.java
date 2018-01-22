package model;

public class Recipe {
	/**Name of the recipe*/
	private String name;
	/**The ingredients to be used in the recipe*/
	private Ingredient[] ingredients;
	/**The amount of each ingredient used in the recipe*/
	private int[] amount;
	/**The count of ingredients in the recipe*/
	private int inCount;
	/**The time required to prepare the recipe*/
	private int prepTime;
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
	 * 
	 */
	public void add_Ingredient(Ingredient i, int amt) {
		//FIX THIS LINE AFTER ADDING INGREDIENT CONSTRUCTORS
		ingredients[inCount] = new Ingredient();
		amount[inCount] = amt;
		inCount++;
	}
	/**
	 * @return the prepTime
	 */
	public int getPrepTime() {
		return prepTime;
	}

	/**
	 * @param prepTime the prepTime to set
	 */
	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}
	
}
