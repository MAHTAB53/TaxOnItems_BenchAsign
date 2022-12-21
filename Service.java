package solutions;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

//Solution 1's  class
public class Service {

	public Item inputItem() {
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the name of item: ");
		String name =s.nextLine();

		System.out.println("Enter the price of item: ");
		Double price =s.nextDouble();

		System.out.println("Enter the quantity of item: ");
		int quantity =s.nextInt();

		System.out.println("Enter the type of item: ");
		String type =s.next();

		type = type.toLowerCase();
		if(!this.verifyItemType(type)) {
			throw new InputMismatchException("invalid item type");
		}
		s.nextLine();
		return new Item(name,type,price,quantity);	
	}

	public boolean inputIsContinue() throws InputMismatchException{
		Scanner s= new Scanner(System.in);
		char status = s.next().charAt(0);
		switch(status) {
		case 'y':
		case 'Y':
			return true;
		case 'n':
		case 'N':
			return false;
		default:
			throw new InputMismatchException("inavlid input!!!");
		}
	}
	public void printItem(Item item) {
		System.out.println(item.toString());
	}

	public double calculateFinalPrice(Item item) {
		double totalItemPrice = item.getitemPrice() * item.getitemQuantity();
		double salesTax =this.calculateSalesTax(totalItemPrice, item.getitemType());
		return totalItemPrice +salesTax;
	}
	private double calculateSalesTax(Double totalItemPrice, String itemType) {
		double percentageTax;
		switch(itemType){
		case "raw":
			percentageTax = 15.5;
			break;
		case "manufactured":
			percentageTax = 20.5;
			break;
		default:
			throw new InputMismatchException("Invalid Item Type!!");

		}
		return totalItemPrice * percentageTax / 100;
	}
	private boolean verifyItemType(String type) {
		return Objects.equals(type, "raw") || Objects.equals(type, "manufactured");
	}
}
