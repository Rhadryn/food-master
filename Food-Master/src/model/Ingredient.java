package model;

public class Ingredient {
	/**Name of ingredient*/
	private String name;
	/**Amount of ingredient in possession*/
	private int possession;
	/**Amount of ingredient recieved on purchase*/
	private int amount;
	/**Unit of measurement for the ingredient's amount*/
	private String unit;
	/**Expiration of ingredient*/
	private int expiration;
	/**Cost of purchase*/
	private double cost;
	
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
