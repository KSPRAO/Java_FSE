package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    // Returns dummy loan data for the given number
    @GetMapping("/api/v1/loans/{number}")
    public Loan retrieveLoanDetails(@PathVariable String number) {
        // Static dummy values, no DB involved
        return new Loan("H00987987972342", "car", 400000, 3258, 18);
    }
}
