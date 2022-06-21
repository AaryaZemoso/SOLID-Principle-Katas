package katas.banking;

import java.time.LocalDateTime;

// Originator
class Account implements Deposit, Withdraw {
    
    int balance;

    Account() {
        balance = 0;
    }

    Account(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        this.balance -= amount;
    }

    AccountMemento saveState() {
        return new AccountMemento(LocalDateTime.now(), this.balance);
    }
}
