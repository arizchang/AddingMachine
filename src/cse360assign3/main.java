/********************************************************************
Author: Ariz Chang
Course: CSE 360
Assignment: 1
Description: This class contains the main method used to create an
AddingMachine object and test its methods.
********************************************************************/

package cse360assign3;

public class main 
{
	public static void main(String[] args)
	{
		AddingMachine machine = new AddingMachine(); //creating new AddingMachine object
		
		machine.add(4);
		machine.subtract(2);
		machine.add(5);
		System.out.println(machine.toString());
	}
}
