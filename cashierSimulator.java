

import java.util.*;
public class cashierSimulator {
	public static void main(String[] args) {
		
		// Intro to the code, waiter is taking the order for your meal
		Scanner in= new Scanner(System.in); 
		System.out.println("Welcome to Langstaff Diner!\n");
		System.out.println("Your waiter today is Darth Vader!");
		System.out.println("\n");
		System.out.println("How many Cheesburgers would you like?");
		int ches= in.nextInt();
		
		// If statement in case you put a negative number
		if (ches<0) {
			System.out.println("Okay, thats not how this works");
		}
		System.out.println("How many Chicken Wings would you like?");
		int cw= in.nextInt();
		if (cw<0) {
			System.out.println("Okay, thats not how this works");
		}
		System.out.println("How many Poutines would you like?");
		int po= in.nextInt();
		if (po<0) {
			System.out.println("Okay, thats not how this works");
		}
		System.out.println("How many Steaks would you like?");
		int sa= in.nextInt();
		if (sa<0) {
			System.out.println("Okay, thats not how this works");
		}
		System.out.println("How many Kabobs would you like?");
		int kb= in.nextInt();
		if (kb<0) {
			System.out.println("Okay, thats not how this works");
		}
		
		// This code will calculate the bill for your meal
		System.out.println("YOUR BILL");
		double chestp= (ches*3.75);
		System.out.printf(ches + " Cheesburgers @ $3.75 each= " + "$%.2f", chestp);
		System.out.println("");
		double cwtp= (cw*1.25);
		System.out.printf(cw + " Chicken Wings @ $1.25 each=" + "$%.2f", cwtp);
		System.out.println("");
		double potp= (po*1.50);
		System.out.printf(po + " Poutines @ $1.50 each=" + "$%.2f", potp);
		System.out.println("");
		double satp= (sa*10.75);
		System.out.printf(sa + " Steaks @ $10.75 each=" + "$%.2f", satp);
		System.out.println("");
		double kbtp= (kb*9.75);
		System.out.printf(kb + " Kabobs @ $9.75 each=" + "$%.2f", kbtp);
		System.out.println("");
		
		//In this code we will calculate total by using tip and tax
		System.out.println("");
		double st=(chestp + cwtp + potp + satp + kbtp );
		System.out.println("Subtotal=" + "$" + st);
		System.out.printf("Total=$%.2f", (st*1.13));
		System.out.println("");
		System.out.print("Please enter tip %");
		double tip= in.nextDouble();
		
		//I added the one so when I multiply it wont be a fraction
		double gt= (st*1.13)*((tip/100)+1);
		System.out.printf("Your grand total is: %.2f",gt);
		System.out.println("\nPlease enter the amount paid:");
		double ap=in.nextDouble();
		double change= (ap-gt);
		
		//There is an if statement in case you pay less than required
		if(ap<gt) {
			System.out.print("Oops! You don't have enough!");
		}
		System.out.printf("\nThe change will be: $%.2f", change);
		System.out.println("");
		System.out.println("");
		System.out.println("To make up this amount, you will need:");
		
		//This code will now calculate how much change is required to give back
		
		//20
		int twnty = (int)(change/20);
		double changeMinus20s = (change-twnty*20);
		double roundChangeMinus20s = (double)Math.round(changeMinus20s*100)/100;
		System.out.print(twnty + " twenty dollars bill\t");
		
		//10
		int tens = (int)(roundChangeMinus20s/10);
		double changeMinus10s = (roundChangeMinus20s-tens*10);
		double roundChangeMinus10s = (double)Math.round(changeMinus10s*100)/100;
		System.out.print(tens + " ten dollars bill\t");
		
		//5
		int five = (int)(roundChangeMinus10s/5);
		double changeMinus5s = (roundChangeMinus10s-five*5);
		double roundChangeMinus5s = (double)Math.round(changeMinus5s*100)/100;
		System.out.print(five + " five dollars bill\t");
		
		//2
		int toon = (int)(roundChangeMinus5s/2);
		double changeMinus2s = (roundChangeMinus5s-toon*2);
		double roundChangeMinus2s = (double)Math.round(changeMinus2s*100)/100;
		System.out.print(toon + " toonies\n");
		
		//1
		int loon = (int)(roundChangeMinus2s/1);
		double changeMinus1s = (roundChangeMinus2s-loon*1);
		double roundChangeMinus1s = (double)Math.round(changeMinus1s*100)/100;
		System.out.print(loon + " loonies\t\t");
		
		//0.25
		int quar = (int)(roundChangeMinus1s/0.25);
		double changeMinusQuarters = (roundChangeMinus1s-quar*0.25);
		double roundChangeMinusQuarters = (double)Math.round(changeMinusQuarters*100)/100;
		System.out.print(quar + " quarters\n");
		
		//0.10
		int dim = (int)(roundChangeMinusQuarters/0.10);
		double changeMinusDimes = (roundChangeMinusQuarters-dim*0.10);
		double roundChangeMinusDimes = (double)Math.round(changeMinusDimes*100)/100;
		System.out.print(dim + " dimes\t\t\t");
		
		//0.05
		int nick = (int)(roundChangeMinusDimes/0.05);
		double changeMinusNickels = (roundChangeMinusDimes-nick*0.05);
		double roundChangeMinusNickels = (double)Math.round(changeMinusNickels*100)/100;
		System.out.print(nick + " nickels\n");
		
		//0.01
		int penni = (int)(roundChangeMinusNickels/0.01);
		double changeMinusPennies = (roundChangeMinusNickels-penni*0.01);
		double roundChangeMinusPennies = (double)Math.round(changeMinusPennies*100)/100;
		System.out.print(penni + " pennies");
		
		System.out.print("\nThank you for eating at Langstaff Diner!");
		
		

	}
	

}

//End of code
