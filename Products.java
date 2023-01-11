import java.util.List;

public class Products extends Specs{

	private List<Specs> products;
	
	public Products(int prodId, String prodName, double prodPrice) {
		super(prodId, prodName, prodPrice);
	}

	public List<Specs> getProducts() {
		return products;
	}

	public void setProducts(List<Specs> products) {
		this.products = products;
	}
}
