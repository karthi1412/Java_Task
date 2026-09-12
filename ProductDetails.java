package sample;

public class ProductDetails {
		
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
		private int id;
		@Override
		public String toString() {
			return "ProductDetails [id=" + id + ", productName=" + productName + ", isActive=" + isActive + "]";
		}
		private String productName;
		private Boolean isActive;
		
	

}
