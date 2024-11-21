package nhuquynh.controller;
import nhuquynh.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@EnableMethodSecurity
public class CustomerController {

    // Predefined list of customers
    private final List<Customer> customers = List.of(
            Customer.builder()
                    .id("001")
                    .name("Nguyễn Hữu Trung")
                    .email("trungnhstk@gmail.com")
                    .build(),
            Customer.builder()
                    .id("002")
                    .name("Hữu Trung")
                    .email("trunghuu@gmail.com")
                    .build()
    );

    // Public endpoint
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello is Guest");
    }

    // Endpoint restricted to ROLE_ADMIN
    @GetMapping("/customer/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<List<Customer>> getCustomerList() {
        List<Customer> list = this.customers;
        return ResponseEntity.ok(list);
    }

    // Endpoint restricted to ROLE_USER
    @GetMapping("/customer/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") String id) {
        List<Customer> filteredCustomers = this.customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .collect(Collectors.toList());
        return ResponseEntity.ok(filteredCustomers.get(0));
    }
}
