package Question4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {
	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	private double price;
	private GregorianCalendar date;
	
	public Book(int id, String name, double price,GregorianCalendar date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date =date;
	}

	@Override
	public String toString() {
		return  id + "\t\t" + name + "\t\t" + price + "\t\t" + date.get(Calendar.YEAR)+"Äê"+date.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"ÔÂ"+date.get(Calendar.DATE)+"ÈÕ";
	}

	
	
	
}
