package springBoot.Project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.Project2.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    Order findByName(String name);
    List<Order> findByCustomerId(int customerId);
}
