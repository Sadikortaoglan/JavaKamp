package Concrete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager  implements OrderService{
	
	private List<Order> orders = new ArrayList<Order>();

    public OrderManager() {
        Order order1 = new Order(1,1,1,1,1,50,20,20);
        Order order2 = new Order(1,1,1,1,1,50,40,20);
        Order order3 = new Order(1,1,1,1,1,50,30,20);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
    }
	@Override
	public void Add(Order order) {
		
		orders.add(order);
		for (Order item : orders) {
			System.out.println(item.getId());
		}
		System.out.println("Eklendi");
		
		//System.out.println("Order eklendi sipariþiriniz  : "+order.getId());
		
	}

	@Override
	public void Update(Order order) {
		
		Order updateOrder=orders.stream()
				.filter(o->o.getId()==order.getId())
				.findFirst()
				.orElse(null);
		
		if(updateOrder!=null) {
			updateOrder.setGamerId(order.getGamerId());
            updateOrder.setAmountOfPayment(order.getAmountOfPayment());
            updateOrder.setCampaignId(order.getCampaignId());
            updateOrder.setCount(order.getCount());
            updateOrder.setDiscountAmount(order.getDiscountAmount());
            updateOrder.setGameId(order.getGameId());
            updateOrder.setId(order.getId());
            updateOrder.setTotalAmount(order.getTotalAmount());
		}
		else {
			System.out.println("Bulunamadý");
		}
		//System.out.println("Order güncellendi sipariþiriniz  : "+order.getId());
		
	}

	@Override
	public void Delete(int orderId) {
		
		Order deleteOrder=orders.stream()
				.filter(o->o.getId()==orderId)
				.findFirst()
				.orElse(null);
		
		if (deleteOrder!=null) {
			orders.remove(deleteOrder);
		}
		else {
			System.out.println("Eþleþmedi");
		}
		//System.out.println("sipariþiniz silindi: "+orderId);
		
	}

}
