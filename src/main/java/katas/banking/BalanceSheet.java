package katas.banking;

import java.util.ArrayList;
import java.util.List;

// CareTaker
class BalanceSheet implements View {
    
    private List<AccountMemento> history;
    
    BalanceSheet() {
        this.history = new ArrayList<>();
    }

    void addState(AccountMemento memento) {
        history.add(memento);
    }

    AccountMemento restoreState() {
        return history.remove(history.size() - 1);
    }

    @Override
    public void printStatement() {

        System.out.printf("%30s%10s%10s\n", "Date", "Amount", "Balance");
        for ( int i = 0; i < history.size(); i++ ) {
            int difference = 0;
            if (i == 0) {
                difference = history.get(i).getBalance();
            } else {
                difference = history.get(i).getBalance() - history.get(i-1).getBalance();
            }
            System.out.printf("%30s%10s%10s\n", history.get(i).getSnapshotTime(), difference >= 0 ? "+" + difference : difference, history.get(i).getBalance());
        }

    }
}
