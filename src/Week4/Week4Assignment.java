package Week4;

import java.util.ArrayList;
import java.util.List;

public class Week4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STEP 1
		
		
		System.out.println("G");
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				
			    //Arrays start at 0, so the first element is index 0 and the last element is array length - 1.
				
				System.out.println(ages[ages.length - 1] - ages[0]);
				
				int[] agesB = {1, 2, 3, 4, 5, 6, 7, 8, 9};

				System.out.println(agesB[agesB.length - 1] - agesB[0]);
				
				//First create an int variable to total the ages.
				//Create a for loop, since the last index is length - 1, we only use < instead of <=.
				//Print out the ages sum divided by the length of the array. 
				
				int agesSum = 0;
				
				for (int i = 0; i < ages.length; i++) {
					agesSum += ages[i];
				}
				
				
				System.out.println(agesSum / ages.length);
				
		//STEP 2
				
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
				//Create an int = 0 to sum the name lengths.
				//Since this String, we need to use [i].length to get the name length got each element.
				//Print the sum of the name lengths by the length of the array.
				
					int namesLengthSum = 0;
				
					for (int i = 0; i < names.length; i++) {
						namesLengthSum += names[i].length();
					}

					System.out.println((namesLengthSum / names.length));
					
				//Use a for loop to pull each element of the array.
				//Use System.out.print to so everything in the loop prints to one line.
				//Add the + " " to create a space between each name. 
				//Only issue is that next print to console is on the same line, hence the blank print below.
					
					for (int i = 0; i < names.length; i++) {
						System.out.print(names[i] + " ");
					} 
					System.out.println(" ");
					
		//STEP 3
					//Since the Array index begin at zero, the last element is array length minus 1.
					//array[array.length - 1]; 
					//Ex. System.out.println(names[names.length - 1]);
					//Ex. names.[5] = "Bob"; ----- Based on the 6 element array. 

		//STEP 4
					//Since the Array index begin at zero, the first element of the array is 0.
					//array[0]; 
					//Ex. System.out.println(names[0]);
					//Ex. names[0] = "Sam";
					
		//STEP 5
					//Create the new array length to match the source array length.
					//Use the index i in each array to pull in each element's value.
					
					int[] nameLengths = new int[names.length];
					
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length();
					}
					
		//STEP 6
					
					//Create an int variable set to zero to sum each element's length
					//For loop to extract the length of each element.
					//Use += to add the length of each element to the sum
					
					int nameSum =  0;

					for (int i = 0; i < nameLengths.length; i++) {
					nameSum += nameLengths[i];
					    }

					System.out.println(nameSum);
					
		//STEP 7
				
				//Method at bottom of page.	
				//Method takes a string and an int and returns a string.
				//For loop to iterate through to to the value of n. 
				//The method concatenates the string without an spaces or separation. 
				//Print the method to the console using the example values from Step 7.
					
				System.out.println(wordTimesN("Hello", 3));
					
		//STEP 8
				//Method at bottom of page.
				//Create a method that takes 2 strings and returns a string.
				//Use concatenate the 2 strings along " " using +. 
				//Example printed to console.
				
				System.out.println(combineName("Bob", "Smith"));
				
		//STEP 9
				//Method at bottom of page.
				//Create a boolean method that takes a array of int.
				//Use an enhanced for loop to iterate of each element in the array.
				//Use an if statement to compare each element to 100.
				//Return true if the condition is met for each element.
				//Return false if the condition is not met.
				//Print to console using ages array.None of the numbers are over 100, so return false.
				
				System.out.println(overHundred(ages));
				
		//STEP 10
				//Method at bottom of page.
				//Create a method that takes a double array and return a double.
				//Create a double with a value of 0 to add each element to.
				//Enhanced for loop to add each element to the total using +=.
				//Return that total divide by the length of the array. 
				//Example array below to print to console.
				
				
				double[] numbers = {1.2, 3.5, 6.7, 9.8, 5.6};
				
				System.out.println(arrayAvg(numbers));
				
				
		//STEP 11		
				//Method at bottom of page.
				//Create a method that returns a double and takes two doubles array.
				//Create a double equal to zero to add the sum of each array.
				//Enhanced for loop for each array to add each elements to a sum.
				//If statement that has each sum divided the array length.
				//Return true if the average value of array 1 is larger than average value of array 2.
				//Sample array below and print to console.
				
				double[] numbers2 = {3.4, 5.9, 13.2};
				
				System.out.println(averageCompare(numbers, numbers2));
				
		//STEP 12
				//Method at bottom of page.
				//Write a method that returns a boolean and takes a boolean and double.
				//Use an If statement that sets the conditions for the boolean to return true.
				//In If statement && is used since both conditions must be met to return true.
				//Create the boolean and double and print to console.
				
				boolean isHotOutside = true;
				double moneyInPocket = 9.15;
				
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				
		//STEP 13
				//Method at bottom of page.
				//This method takes a list and character and returns a list.
				//This method will create a list of the names that start with selected character.
				//Enhanced for loop to iterate through the list.
				//If statement of the the first letter matches the selected character.
				//Used the charAt(0) to determine the first letter of each name.
				//Add each name that meets the If statement to the list.
				//Return the list. 
				
				List<String> dogNames = new ArrayList<String>();
				 
				dogNames.add("Toto");
				dogNames.add("Lassie");
				dogNames.add("Rin Tin Tin");
				dogNames.add("Pluto");
				dogNames.add("Yeller");
				dogNames.add("Clifford");
				dogNames.add("Scooby");
				dogNames.add("Snoopy");
				dogNames.add("Air Bud");
				
				System.out.println(dogNameLetter(dogNames, 'S'));
				
				
				
			}
			
		//STEP 7 METHOD	
			 public static String wordTimesN(String word, int n) {
				 String wordConcat = "";
				 for (int i = 0; i < n; i++) {
					 wordConcat += word;
				 }return wordConcat;
			 }

		//STEP 8 METHOD
			 public static String combineName (String firstName, String lastName) {
				 	String fullName = (firstName + " " + lastName);
				 	return fullName;
			 }

		//STEP 9 METHOD
			 public static boolean overHundred (int[] array) {
				 for (int number : array) {
					 if (number > 100) {
						 return true;
					 }
				 }return false;
			 }
			 
		//STEP 10 METHOD
			 public static double arrayAvg (double[] array) {
				 double sum = 0.0;
				 for (double number : array) {
					 sum += number;
				 } return sum / array.length;
			 }
			 
			 
		//STEP 11 METHOD	 
			 public static boolean averageCompare (double[] array1, double[] array2) {
				 double sum1 = 0.0;
				 double sum2 = 0.0;
				 for (double num1 : array1) {
					 sum1 += num1;
				 } for (double num2 : array2) {
					 sum2 += num2;
				 } if ((sum1 / array1.length) > (sum2 / array2.length)) {
					 return true;
				 }return false;
			 }
			 
			 
		//STEP 12 METHOD
			 public static boolean willBuyDrink (boolean bool, double number) {
				 if (bool == true && number > 10.50) {
					 return true;
				 }return false;
			 }
			 
		//STEP 13 METHOD
			 public static List<String> dogNameLetter (List<String> list, char c){
				 		List<String> dogList = new ArrayList<String>();
				 		for (String name : list) {
				 			if (name.charAt(0) == c) {
				 				dogList.add(name);
				 			}
				 		}return dogList;
			 }
			
			
				 		
			

		}