package springBoot.Project2.service;

import springBoot.Project2.model.Customer;
import springBoot.Project2.model.Order;
import springBoot.Project2.model.Product;
import springBoot.Project2.repository.CustomerRepository;

import java.util.List;

public class CustomerService {
    private final CustomerRepository customerRepository;
    private final Product product;

    public CustomerService(CustomerRepository customerRepository, Product product) {
        this.customerRepository = customerRepository;
        this.product = product;
    }


    public void saveOrder(Order order, int customerId) {
    }

    public void save(Customer customer) {
    }

    public Customer getById(int customerId) {
    }

    public double totalPrice(int customerId) {
        double totalPrice =  product.getPrice() * product.getQuantity();
        return totalPrice;
    }

    public List<Customer> getAllCustomers() {
    }
}
