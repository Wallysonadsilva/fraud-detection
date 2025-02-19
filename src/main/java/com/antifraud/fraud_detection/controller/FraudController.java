package com.antifraud.fraud_detection.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fraud")
public class FraudController {
    @GetMapping("/check")
    public String checkTransaction(@RequestParam double amount){
        if (amount > 1000){
            return " Fraud detected for transaction of £" + amount;
        }
        return " Transaction approved for $" + amount;
    }

}
