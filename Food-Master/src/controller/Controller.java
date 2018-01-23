package controller;

import model.Ingredient;
import model.Meal;
import model.Plan;
import model.Recipe;

public class Controller {
	/**Array of possible ingredients*/
	private Ingredient[] ingredients;
	/**Array of possible recipes*/
	private Recipe[] recipes;
	/**Array of possible meals*/
	private Meal[] meals;
	/**Array of meal plans*/
	private Plan[] plans;

	public static void main(String[] args) {

	}

	/**
	 * @param index the index of the ingredient
	 * @return the ingredient at index
	 */
	public Ingredient getIngredient(int index) {
		return ingredients[index];
	}

	/**
	 * @param index the index of the ingredient to be changed
	 * @param ingredient the ingredient to set
	 */
	public void setIngredient(int index, Ingredient ingredient) {
		this.ingredients[index] = ingredient;
	}
	/**
	 * @param index the index of the recipe
	 * @return the recipe at index
	 */
	public Recipe getRecipe(int index) {
		return recipes[index];
	}

	/**
	 * @param index the index of the recipe to be changed
	 * @param recipe the recipe to set
	 */
	public void setRecipe(int index, Recipe recipe) {
		this.recipes[index] = recipe;
	}
	/**
	 * @param index the index of the meal
	 * @return the meal at index
	 */
	public Meal getMeal(int index) {
		return meals[index];
	}

	/**
	 * @param index the index of the ingredient to be changed
	 * @param ingredient the ingredient to set
	 */
	public void setMeal(int index, Meal meal) {
		this.meals[index] = meal;
	}
	
	/**
	 * @param index the index of the plan
	 * @return the plan at index
	 */
	public Plan getPlan(int index) {
		return plans[index];
	}

	/**
	 * @param index the index of the plan to be changed
	 * @param plan the plan to set
	 */
	public void setPlan(int index, Plan plan) {
		this.plans[index] = plan;
	}
}
