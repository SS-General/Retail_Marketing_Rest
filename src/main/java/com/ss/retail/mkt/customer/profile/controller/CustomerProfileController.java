package com.ss.retail.mkt.customer.profile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerProfileController {
    
    @RequestMapping("/register/customer")
    public String registerCustomer() {
        return "Retail Market Welcomes You!";
    }
    
}
