package springBoot.Project2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.PrimitiveIterator;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private String address;

    // One customer can have multiple orders
    @OneToMany(mappedBy = "customer", cascade = CascadeType.PERSIST)
        @JsonManagedReference
    Set<Order> order = new HashSet<>();
}
