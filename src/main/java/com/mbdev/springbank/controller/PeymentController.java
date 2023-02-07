package com.mbdev.springbank.controller;

import com.mbdev.springbank.controller.dto.PaymentRequestDTO;
import com.mbdev.springbank.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeymentController {

    private final PaymentService paymentService;

    @Autowired
    public PeymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public Object pay(@RequestBody PaymentRequestDTO paymentRequestDTO) {

        return paymentService.pay(paymentRequestDTO.getAccountId(), paymentRequestDTO.getAmount());
    }

    @PostMapping("/deposits")
    public Object deposit(@RequestBody PaymentRequestDTO paymentRequestDTO) {

        return paymentService.deposit(paymentRequestDTO.getAccountId(), paymentRequestDTO.getAmount());
    }
}
