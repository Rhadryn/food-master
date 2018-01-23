package model;

/**
 * This class represents an ingredient used in a recipe.
 * Ingredients are also kept in food storage and
 * refilled via shopping trips.
 * @author Joshua Bryant
 *
 */
public class Ingredient {
	/**Name of ingredient*/
	private String name;
	/**Amount of ingredient in possession*/
	private int possession;
	/**Amount of ingredient received on purchase*/
	private int amount;
	/**Unit of measurement for the ingredient's amount*/
	private String unit;
	/**Expiration of ingredient*/
	private int expiration;
	/**Cost of purchase*/
	private double cost;
	/**
	 * Default constructor, initializes properties to logical values
	 */
	public Ingredient() {
		name = "";
		possession = 0;
		amount = 0;
		unit = "??";
		expiration = 0;
		cost = 0;
	}
	/**
	 * Copy constructor, uses passed object to create object
	 * @param i Ingredient to copy 
	 */
	public Ingredient(Ingredient i) {
		name = i.getName();
		possession = i.getPossession();
		amount = i.getAmount();
		unit = i.getUnit();
		expiration = i.getExpiration();
		cost = i.getCost();
	}
	/**
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
	 * @return the possession
	 */
	public int getPossession() {
		return possession;
	}
	/**
	 * @param possession the possession to set
	 */
	public void setPossession(int possession) {
		this.possession = possession;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the expiration
	 */
	public int getExpiration() {
		return expiration;
	}
	/**
	 * @param expiration the expiration to set
	 */
	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Purchase the ingredient, changing the amount
	 */
	public void purchase() {
		this.possession += this.amount;
	}
}
