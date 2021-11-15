
public class Product {
		private int id;
		private String productname;
		private String explanation;
		private String price;
		public Product() {
			super();
		}
		public Product(int id, String productname, String explanation, String price) {
			super();
			this.id = id;
			this.productname = productname;
			this.explanation = explanation;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public String getExplanation() {
			return explanation;
		}
		public void setExplanation(String explanation) {
			this.explanation = explanation;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		
		
		
}
