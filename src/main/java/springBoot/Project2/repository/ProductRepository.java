package springBoot.Project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.Project2.model.Product;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
