import java.util.ArrayList;

public class ProductManager implements ProductService {
	private LogService[] Logger;

	public ProductManager(LogService[] Logger) {
		this.Logger = Logger;
	}

	@Override
	public void save(Product product) {

		tools.Log(Logger);
	}

}
