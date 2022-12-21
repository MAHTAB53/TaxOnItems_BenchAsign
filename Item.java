package solutions;
//Solution 1's  class
public class Item {
	private String itemName;
	private String itemType;
	private Double itemPrice;
	private int itemQuantity;
	private Double TotalItemPrice;
	
	public Item(String itemName,String itemType, Double itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
		
	}
	
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getitemType() {
		return itemType;
	}
	public void setitemType(String itemType) {
		this.itemType = itemType;
	}

	public Double getitemPrice() {
		return itemPrice;
	}
	public void setitemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getitemQuantity() {
		return itemQuantity;
	}
	public void setitemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public Double getTotalItemPrice() {
		return TotalItemPrice;
	}
	public void setTotalItemPrice(Double TotalItemPrice) {
		this.TotalItemPrice = TotalItemPrice;
	}
	
	public String toString() {
		return "Item details:-   " +"itemName: " + itemName + " || itemPrice: "+itemPrice+  " || itemQuantity: "+itemQuantity +  " || itemType: "+itemType + " || TotalItemPrice: "+TotalItemPrice + " (including Tax)";  
	}//Item details:-  itemName: ds || itemPrice: 32.0 || itemQuantity: 2 || itemType: raw || TotalItemPrice: 73.92 (including Tax)
}
