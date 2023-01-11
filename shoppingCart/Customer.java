package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDetails p1 = new ProductDetails(1, "Keyboard", 300);
		ProductDetails p2 = new ProductDetails(2, "Mouse", 500);
		ProductDetails p3 = new ProductDetails(3, "Monitor", 1000);
		
		TotalBill tb = new TotalBill();
		
		
		AllProducts ap = new AllProducts();
		List<ProductDetails> li = new ArrayList<>();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		
		tb.calculateTotalPrice(ap);

	}

}
