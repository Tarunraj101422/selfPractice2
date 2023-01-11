
public class Specs {
	private int prodId;
	private String prodName;
	private double prodPrice;
	
	
	public Specs(int prodId, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;		
	}
	
	public int getProdId(){
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

}
