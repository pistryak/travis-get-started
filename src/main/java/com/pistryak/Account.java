package com.pistryak;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new NegativeAmountWithdrawException();
        }
        balance = balance.subtract(amount);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}