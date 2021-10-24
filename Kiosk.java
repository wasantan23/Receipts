
   
//Tanisha Wasan
import java.util.Scanner; 

public class Kiosk {
	
	public static void main (String [] args) { //main class
		
		Scanner Items = new Scanner (System.in); //scanner  
		Printer Myprinter = new Printer (); // printer class object is created

			double pizza = 5; //variables
			double chips = 1.50;
			double coke = 2;
			double sandwich = 3.5;
			double cereal = 6;
			int firstItem = 0, secondItem = 0, thirdItem = 0 , fourthItem = 0 , fifthItem = 0;
			
			
			System.out.println("Welcome to the kiosk! We are selling 5 items.");  //lines 23 - 29 - menu and introduction display for user
			System.out.println("Pizza for $ 5");
			System.out.println("Chips for $1.50");
			System.out.println("Coke for $2");
			System.out.println("Sandwich for $3.5");
			System.out.println("Cereal for $6.");
			System.out.println("Would you like to shop? Type 'Y' to shop and 'N' to exist.");
			
			String shop = Items.nextLine();
			
		
		
				
				if (shop.equals("Y")|| shop.equals("y")) { //checks if the user wants to shop
					System.out.println("How many slices of pizza would you like to buy? You can't have more than 9 of an item.");
					firstItem = Items.nextInt(); //scans the user input
					while (firstItem > 9) { //checks if the user inputed more than 9 items
						System.out.println("How many slices of pizza would you like to buy? You can't have more than 9 of an item."); //reasks the question if the user inputs more than 9 items
						 firstItem = Items.nextInt(); 
					}
					
						
					
					System.out.println("How many bags of chips would you like to buy? You can't have more than 9 of an item.");
					secondItem = Items.nextInt();
					while (secondItem > 9) {
						
					System.out.println("How many bags of chips would you like to buy? You can't have more than 9 of an item.");
					secondItem = Items.nextInt();
					}
					
					
					System.out.println("How many cans of coke would you like to buy? You can't have more than 9 of an item. ");
					thirdItem = Items.nextInt();
					while (thirdItem > 9) {
					System.out.println("How many cans of coke would you like to buy? You can't have more than 9 of an item. ");
					thirdItem = Items.nextInt();
					}
					
					
					System.out.println("How many sandwiches would you like to buy? You can't have more than 9 of an item.");
					fourthItem = Items.nextInt();
					while (fourthItem > 9) {
					System.out.println("How many sandwiches would you like to buy? You can't have more than 9 of an item.");
					fourthItem = Items.nextInt();
					}

					System.out.println("How many boxes of cereal would you like to buy? You can't have more than 9 of an item.");
					fifthItem = Items.nextInt();
					while (fifthItem > 9) {
					System.out.println("How many boxes of cereal would you like to buy? You can't have more than 9 of an item.");
					fifthItem = Items.nextInt();
					}
					
				
				}
				else {
					System.out.println("Thanks for shopping"); //if the if statement does not run it will turn to this
				}
				
				Myprinter.printReciept(firstItem, secondItem, thirdItem, fourthItem, fifthItem); //calling the method from printer class
			} //closes the main method
		} //closes the class
				
			
				
				
			
		
		
	
	
				

