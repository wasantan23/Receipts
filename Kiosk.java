//Tanisha Wasan
import java.util.Scanner; 

public class Kiosk {
	
	public static void main (String [] args) { 
		
		Scanner Items = new Scanner (System.in); 
		// Printer Myprinter = new Printer (); 

			int pizza = 5;
			double chips = 1.50;
			int coke = 2;
			double sandwich = 3.20;
			double cereal = 6.50;
			int price = 0; 
			double tax = 0;
			int totalItems = 0;
			
			System.out.println("Welcome to the kiosk! We are selling 5 items."); 
			System.out.println("Pizza for $ 5");
			System.out.println("Chips for $1");
			System.out.println("Coke for $2");
			System.out.println("Sandwich for $3");
			System.out.println("Cereal for $6");
			System.out.println("Would you like to shop? Type 'Y' to shop and 'N' to exist.");
			
			String shop = Items.nextLine();
			
		
		
				while (totalItems <= 9) { 
				if (shop.equals("Y")|| shop.equals("y")) {
					System.out.println("How many slices of pizza would you like to buy?");
					String firstItem = Items.nextLine();
					int firstItemNum = Integer.parseInt(firstItem);
					int firstItemPrice = firstItemNum * 5; 
					totalItems += firstItemNum;
					System.out.println("How many bags of chips would you like to buy?");
					String secondItem = Items.nextLine();
					int secondItemNum = Integer.parseInt(secondItem);
					int secondItemPrice = secondItemNum * 1.50;
					totalItems += secondItemNum;
					System.out.println("How many cans of coke would you like to buy? ");
					String thirdItem = Items.nextLine();
					int thirdItemNum = Integer.parseInt(thirdItem);
					int thirdItemPrice = thirdItemNum * 2;
					totalItems += thirdItemNum;
					System.out.println("How many sandwiches would you like to buy??");
					String fourthItem = Items.nextLine();
					int fourthItemNum = Integer.parseInt(fourthItem);
					int fourthItemPrice = fourthItemNum * 3.20;
					totalItems += fourthItemNum;
					System.out.println("How many boxes of cereal would you like to buy?");
					String fifthItem = Items.nextLine();
					int fifthItemNum = Integer.parseInt(fourthItem);
					int fifthItemPrice = fifthItemNum * 6.50;
					totalItems += fifthItemPrice;
				}
				}
				
				// make qty for item, description and total price
				//p1.print (int quantity, str 
				
				System.out.print("Thanks for shopping!");
				
			}
		}
		
		
		/* if (firstItemNum > 0) {
		}
		
		else if (secondItemNum > 0) {
		}
			
		else if (thirdItemNum > 0) {
		}
			
		else if (fourthItemNum > 0) {
		}
			
		else if (fifthItemNum > 0) {
		}
	/*
	
