package com.staffsterr2000.customer.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
