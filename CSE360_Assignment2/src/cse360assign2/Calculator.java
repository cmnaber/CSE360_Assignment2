
/**
 * This class is a simulated calculator that can do all basic
 * functions of a calculator
 * 
 * @author  Christopher Naber
 * @class  CSE360
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * This method creates a calculator class.
	 */	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This class retrieves the total of the calculated values.
	 * @return
	 */	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This is the add function of the calculator.
	 * @param value
	 */	
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * This is the subtract function of the calculator.
	 * @param value
	 */	
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * This is the multiply function of the calculator.
	 * @param value
	 */	
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * This is the Divide function of the calculator.
	 * @param value
	 */	
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
	}
	
	/**
	 * This prints out the history of the input.
	 * @return
	 */	
	public String getHistory () {
		return "";
	}
}
