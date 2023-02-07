package com.mbdev.springbank.controller;

import com.mbdev.springbank.controller.dto.BillRequestDTO;
import com.mbdev.springbank.controller.dto.BillResponseDTO;

import java.util.List;

public class AccountRequestDTO {
    private String name;

    private String email;

    private List<BillRequestDTO> bills;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<BillRequestDTO> getBills() {
        return bills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBills(List<BillRequestDTO> bills) {
        this.bills = bills;
    }
}
