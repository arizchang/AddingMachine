/********************************************************************
Author: Ariz Chang
Course: CSE 360
Assignment: 2
Description: This program can add and subtract numbers, as well as 
return the total.
********************************************************************/

package cse360assign2;

public class AddingMachine 
{

	private int total;
	private String history;
	
	//constructor
	public AddingMachine () 
	{
		total = 0;
		history = total + "";
	}
	
	//returns the total 
	public int getTotal () 
	{
		return total;
	}
	
	//adds parameter to total
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	//subtracts parameter from total
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
		
	//returns a String of operations performed
	public String toString () 
	{
		return history;
	}

	//clears total to 0
	public void clear() 
	{
		total = 0;
		history = total + "";
	}
	
	//main method executing the program
	public static void main(String[] args)
	{
		AddingMachine machine = new AddingMachine(); //creating new AddingMachine object
		
		machine.add(4);
		machine.subtract(2);
		machine.add(5);
		System.out.println(machine.toString());
	}
}
