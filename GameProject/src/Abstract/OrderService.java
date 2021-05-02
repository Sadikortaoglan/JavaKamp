package Abstract;
import Entities.Order;

public interface OrderService {

	void Add(Order order);
	void Update(Order order);
	void Delete(int orderId);
}
