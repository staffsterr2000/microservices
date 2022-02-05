package com.staffsterr2000.customer.request;

import lombok.Data;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
