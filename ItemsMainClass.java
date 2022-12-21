package solutions;

import java.util.ArrayList;
import java.util.List;

//Solution 1's  main class

public class ItemsMainClass {
	private static final Service service =new Service();

	public static void main(String[] args) {
		List<Item> items =new ArrayList<>();
		
		boolean isContinue = true;
		while(isContinue) {
			try {
				Item item =service.inputItem();
				items.add(item);
				System.out.println("Do you want add other item details(y/n):  ");
				
				isContinue =service.inputIsContinue();
			}catch(Exception e)
			{
				System.out.println("Exception here!!- "+e.getMessage());
			}
		}
		for(Item item:items) {
			double totalItemPrice = service.calculateFinalPrice(item);
			item.setTotalItemPrice(totalItemPrice);
			service.printItem(item);
		}
	}
}
