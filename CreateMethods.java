package com.hubgitalvin.week2;

import java.util.Scanner;

/*
 * Student:  Alvin H. Revilas
 * Week 3, first assignment
 * 
 * Assignment requirements (as written):
 * Based on the code that you wrote in the previous assignment 
 * (where you collected numeric inputs from the Scanner), you now 
 * need to turn that code into a new method.
 * 
 * This new method should return an Integer.
 * 
 * However, this method should return null if the number that the 
 * user inputs is outside of the expected range of 50 to 300, otherwise 
 * it should just return the value that the user input into the scanner.
 * 
 * You then need to take the value that was returned from this method,
 *  and display it inside of a console message that says "The number 
 *  you typed in was: [theReturnedValueFromMethodHere]"
 * 
 * Do NOT put the final console message display code inside of the new 
 * method. The final console message display code should be inside of 
 * your main method.
 * 
 * Discovery: Methods or processes that are used in the main like to be declared static
 * I don't know why yet.
 * 
 */
public class CreateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lowerLimit = 50, upperLimit = 300;
		String responseString = "Yes"; 
		Integer myResult; 
		
		Scanner firstInput = new Scanner(System.in); 
		System.out.println("Type a number between " + lowerLimit + " and " + upperLimit + ": ");

		String userInput = firstInput.nextLine(); 
		
		myResult = processInput(userInput, lowerLimit, upperLimit); 
		
		if (myResult == null) { responseString = "No"; }
		
		System.out.println(responseString); 
		firstInput.close();
	}
	
	public static Integer processInput(String myInput, int lowLim, int upLim) {
		
		Integer myResult = Integer.parseInt(myInput); 
		int processedInt = myResult.intValue(); 
		
		if ((processedInt <= lowLim) || (processedInt >= upLim)) { myResult = null; }
		
		return myResult; 
	}

}
