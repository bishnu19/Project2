package springBoot.Project2.controler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springBoot.Project2.model.Customer;
import springBoot.Project2.model.Order;
import springBoot.Project2.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Customer customer) {
        customerService.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body("A new customer is created.");

    }

    @PutMapping("/addOrder/{customerId}")
    public ResponseEntity<Customer> addOrder(@RequestBody Order order, @PathVariable int customerId) {
        System.out.println(order.getQuantity());
        customerService.saveOrder(order, customerId);
        Customer customer = customerService.getById(customerId);
        return ResponseEntity.status(HttpStatus.FOUND).body(customer);
    }

    @GetMapping("/allCustomers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.status(HttpStatus.FOUND).body(customers);
    }

    @GetMapping("/orderReview/{customerId}")
    public ResponseEntity<String> getPriceDetails(@PathVariable int customerId) {
        int totalPrice = customerService.totalPrice(customerId);
        String price = "The total price is: " + totalPrice;
        return ResponseEntity.status(HttpStatus.OK).body(price);
    }

}
