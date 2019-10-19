/********************************************************************
Author: Ariz Chang
Course: CSE 360
Assignment: 3
Description: This program can add and subtract numbers, as well as 
return the total.
********************************************************************/

package cse360assign3;

public class Calculator extends AddingMachine
{
	//constructor
	public Calculator()
	{
		total = 0;
		history = total + "";
	}
	
	//multiplies value with total
	public void mult(int value)
	{
		total = total * value;
		history += " * " + value;
	}
	
	//divides value from total
	public void div(int value)
	{
		if(value == 0)
			total = 0;
		else
			total = total / value;
		
		history += " / " + value;
	}
	
	//raises total to the power of value
	public void power(int value)
	{
		if(value < 0)
			total = 0;
		else
			total = (int) Math.pow(total, value);	
		
		history += " ^ " + value;
	}
}
