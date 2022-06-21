package katas.banking;

class Main {
    public static void main(String args[]) {

        /*
         * This is an example of solving the problem using the Memnto Design Pattern.
         *  
         * It also follows all the SOLID Principles.
         */

        Account zemAccount = new Account();
        BalanceSheet sheet = new BalanceSheet();

        zemAccount.deposit(500);
        AccountMemento depositState = zemAccount.saveState();
        sheet.addState(depositState);

        zemAccount.withdraw(100);
        AccountMemento withdrawState = zemAccount.saveState();
        sheet.addState(withdrawState);

        System.out.println("It is creating two separate states by creating new objects :- ");
        System.out.println("State at the time of deposit :- " + depositState.hashCode() + " with balance = " + depositState.getBalance());
        System.out.println("State at the time of withdraw :- " + withdrawState.hashCode() + " with balance = " + withdrawState.getBalance());
        System.out.println();

        sheet.printStatement();
    }
}