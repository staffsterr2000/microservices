package com.staffsterr2000.customer.service;

import com.staffsterr2000.customer.model.entity.Customer;
import com.staffsterr2000.customer.repository.CustomerRepository;
import com.staffsterr2000.customer.request.CustomerRegistrationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
