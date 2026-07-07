package com.sample.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.sample.account.model.Loan;

@RestController
public class AccountController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {

        Map<String, Object> response = new HashMap<>();

        response.put("number", number);
        response.put("type", "savings");
        response.put("balance", 234343);

        Loan loan = restTemplate.getForObject(
                "http://localhost:8081/loans/H00987987972342",
                Loan.class);

        response.put("loanDetails", loan);

        return response;
    }
}