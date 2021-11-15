
public class Main {

	public static void main(String[] args) {

		LogService[] Logger = { new DbLogger(), new FileLogger() };
		ProductManager productManager = new ProductManager(Logger);
		productManager.save(null);

	}
}