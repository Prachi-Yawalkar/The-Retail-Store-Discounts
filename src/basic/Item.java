package basic;

public interface Item {
	 double getUnitPrice();
	    
	    double priceForQuantity(int quantity);
	    
	    String getName();
	    
	    ItemType getType();
}
