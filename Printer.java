//Tanisha Wasan

public class Printer {


public void printReciept(int firstItem, int secondItem, int thirdItem, int fourthItem, int fifthItem) { // printer class method
	double price = 0.0;
	double tax = 0.0;
	if (firstItem > 0) { //checking if the user inputed more than one pizza
		double firstItemPrice = firstItem* 5;  //multiplying the number of pizzas by 5, the assigned price of pizza
		price += firstItemPrice; // adding the price of the first item to the sub total
		System.out.println("QTY" + "\t ITEM \t \t \t " + "PRICE"); //up top header 
		System.out.println(firstItem + "\t Pizza \t \t \t " + firstItemPrice); //tab is 4 spaces
		
	}
	if (secondItem > 0) { //checking if the user inputed more than one packet of chips
		double secondItemPrice = secondItem * 1.50; //multiplying the number of packets by 1.50, the assigned price of chips
		price += secondItemPrice; // adding the price of the second item to the sub total
		System.out.println(secondItem + "\t Chips \t \t \t " + secondItemPrice);
	}
	if (thirdItem > 0) { //checking if the user inputed more than one can of coke
		double thirdItemPrice = thirdItem * 2; //multiplying the number of cans by 2, the assigned price of coke
		price += thirdItemPrice; // adding the price of the third item to the sub total
		System.out.println(thirdItem + "\t Coke \t \t \t " + thirdItemPrice);
	}
	if (fourthItem > 0) { //checking if the user inputed more than one sandwich
		double fourthItemPrice = fourthItem * 3.5; //multiplying the number of sandwiches by 2.5, the assigned price of sandwiches
		price += fourthItemPrice; // adding the price of the fourth item to the sub total
		System.out.println(fourthItem + "\t Sandwich \t \t " + fourthItemPrice);
	}
	if (fifthItem > 0) { //checking if the user inputed more than one packet of cereal
		double fifthItemPrice = fifthItem * 6; //multiplying the number of packets by 6 the assigned price of cereal
		price += fifthItemPrice; // adding the price of the fifth item to the sub total
		System.out.println(fifthItem + "\t Cereal \t \t " + fifthItemPrice);
	}
		System.out.println("");
		System.out.println("\t Sub total \t  \t " + price );
		System.out.println("\t Tax \t  \t \t " + price * 0.07 ); //calculating 7 percent tax by multiplying by 0.07
		System.out.println("\t Total \t  \t \t " + (price * 0.07 + price)); //calculating the total
} //closes the method
} //closes the class
