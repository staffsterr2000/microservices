package com.staffsterr2000.customer.controller;

import com.staffsterr2000.customer.request.CustomerRegistrationRequest;
import com.staffsterr2000.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer in controller {}", customerRegistrationRequest);
        customerService.register(customerRegistrationRequest);
    }
}
