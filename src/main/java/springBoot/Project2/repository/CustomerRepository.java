package springBoot.Project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.Project2.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
