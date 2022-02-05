package com.staffsterr2000.customer.service;

import com.staffsterr2000.customer.model.entity.Customer;
import com.staffsterr2000.customer.request.CustomerRegistrationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public record CustomerService() {

    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        log.info("new customer in service {}", customer);
    }
}
