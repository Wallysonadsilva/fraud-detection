package com.antifraud.fraud_detection.service;

import com.antifraud.fraud_detection.model.Transaction;
import com.antifraud.fraud_detection.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction checkTransaction(double amount){
        String status = (amount > 1000) ? "FRAUD" : "APPROVED";
        Transaction txn = new Transaction(null,amount, status);
        return transactionRepository.save(txn);
    }

}
