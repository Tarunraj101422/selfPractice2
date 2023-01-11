package shoppingCart;


import java.util.List;

public class TotalBill {
	private double totalPrice;

	

	public void calculateTotalPrice(AllProducts cart) {
		List<ProductDetails> products = cart.getProducts();
		for(ProductDetails product: products) {
			totalPrice = totalPrice+product.getproductPrice();
			System.out.println(product);
		}
	}

}
