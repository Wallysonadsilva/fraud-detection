package com.antifraud.fraud_detection.controller;

import com.antifraud.fraud_detection.model.Transaction;
import com.antifraud.fraud_detection.service.FraudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fraud")
public class FraudController {

    @Autowired
    private  FraudService fraudService;

    @GetMapping("/check")
    public Transaction checkTransaction(@RequestParam double amount){
        return fraudService.checkTransaction(amount);
    }
}
