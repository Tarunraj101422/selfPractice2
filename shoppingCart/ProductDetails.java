package shoppingCart;

public class ProductDetails {
	private int productId;
	private String productName;
	private double productPrice;

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getproductPrice() {
		return productPrice;
	}

	public ProductDetails(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
}
