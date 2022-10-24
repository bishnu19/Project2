package springBoot.Project2.startUpLoader;

import org.springframework.boot.CommandLineRunner;
import springBoot.Project2.model.Product;
import springBoot.Project2.repository.ProductRepository;


public class StartUpLoader implements CommandLineRunner {
    private final ProductRepository productRepository;

    public StartUpLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Product product = Product.builder().name("Laptop").quantity(2).price(500).build();
        Product product1 = Product.builder().name("Java Books").quantity(20).price(150).build();
        productRepository.save(product);
        productRepository.save(product1);

    }
}
