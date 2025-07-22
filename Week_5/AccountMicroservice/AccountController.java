package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.account.model.Account;

@RestController
public class AccountController {

    // Returns dummy account details for the given account number
    @GetMapping("/api/v1/accounts/{number}")
    public Account fetchAccountDetails(@PathVariable String number) {
        // Dummy response, backend not connected
        return new Account("00987987973432", "savings", 234343.0);
    }
}
