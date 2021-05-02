package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager  implements OrderService{

	@Override
	public void Add(Order order) {
		System.out.println("Order eklendi siparişiriniz  : "+order.getId());
		
	}

	@Override
	public void Update(Order order) {
		System.out.println("Order güncellendi siparişiriniz  : "+order.getId());
		
	}

	@Override
	public void Delete(int orderId) {
		System.out.println("siparişiniz silindi: "+orderId);
		
	}

}
