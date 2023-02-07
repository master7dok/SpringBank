package com.mbdev.springbank.utils;

import com.mbdev.springbank.entity.Account;
import com.mbdev.springbank.entity.Bill;
import com.mbdev.springbank.exception.NotDefaultBillAction;

public class AccountUtils {

    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills().stream().
                filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillAction("Undable to find default bill for account with id:"
                        + accountFrom.getAccountId()));
    }
}
