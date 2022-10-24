package springBoot.Project2.service;

import org.springframework.stereotype.Service;
import springBoot.Project2.exception.OrderException;
import springBoot.Project2.model.Order;
import springBoot.Project2.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public Order get(int id) {
        return orderRepository.findById(id).orElseThrow(() -> new OrderException(id));
    }

    public void saveValue(Order order) {
        orderRepository.save(order);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public List<Order> getByCustomer(int customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}
