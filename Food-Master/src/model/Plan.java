package model;

public class Plan {
	/**Days of the week*/
	enum days{sun, mon, tue, wed, thu, fri, sat};
	/**Meals of the day*/
	enum mealtimes{breakfast, lunch, dinner};
	/**Starting date of this week's plan*/
	private int startDate;
	/**Array of each meal of the week*/
	private Meal[] meals;
}