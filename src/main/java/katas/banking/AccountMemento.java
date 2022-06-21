package katas.banking;

import java.time.LocalDateTime;

// Memento
public class AccountMemento {
    
    private LocalDateTime snapshotTime;
    private int balance;

    AccountMemento(LocalDateTime snapshotTime, int balance) {
        this.snapshotTime = snapshotTime;
        this.balance = balance;
    }

    public LocalDateTime getSnapshotTime() {
        return this.snapshotTime;
    }

    public int getBalance() {
        return balance;
    }
}
