
/**
 * This class is a simulated calculator that can do all basic
 * functions of a calculator
 * 
 * @author  Christopher Naber
 * @class  CSE360
 * @Class_ID 501
 * @Project Assignment 2
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * This method creates a calculator class.
	 */	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; //Beginning of every history
	}
	
	/**
	 * This class returns the final total in the calculator.
	 * @return
	 */	
	public int getTotal () {
		return total;
	}
	
	/**
	 * This is the add function of the calculator.
	 * @param value
	 */	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value; //add the value to the history
	}
	
	/**
	 * This is the subtract function of the calculator.
	 * @param value
	 */	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value; //add the value to the history
	}
	
	/**
	 * This is the multiply function of the calculator.
	 * @param value
	 */	
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value; //add the value to the history
	}
	
	/**
	 * This is the Divide function of the calculator.
	 * @param value
	 */	
	public void divide (int value) {
		if(value == 0) { //dividing by zero normally gives an error
			total = 0;
			history = history + " / " + value; //add the value to the history
		}
		else {
			total = total / value;
			history = history + " / " + value; //add the value to the history
		}
	}
	
	/**
	 * This immediately returns history of the input.
	 * @return
	 */	
	public String getHistory () {
		return history;
	}
}
