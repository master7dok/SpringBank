package com.mbdev.springbank.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class TransferRequestDTO {

    @JsonProperty("accountIdFrom")
    public Long accountIdFrom;
    @JsonProperty("AccountIdTo")
    private Long getAccountIdTo;
    @JsonProperty("amount")
    private BigDecimal amount;

    public Long getAccountIdFrom() {
        return accountIdFrom;
    }

    public void setAccountIdFrom(Long accountIdFrom) {
        this.accountIdFrom = accountIdFrom;
    }

    public Long getGetAccountIdTo() {
        return getAccountIdTo;
    }

    public void setGetAccountIdTo(Long getAccountIdTo) {
        this.getAccountIdTo = getAccountIdTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
