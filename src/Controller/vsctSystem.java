package Controller;

import java.util.Scanner;
import Model.Account;

public class vsctSystem {
    private static DespositTransaction deposit;
    private static WithdrawTransaction withdraw;

    public static MenuOption ReadMenuOption() {
        do {
            try {
                System.out.println("*****************");
                System.out.println("SELECT AN OPTION");
                System.out.println("1. Create new account");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Print");
                System.out.println("5. Transfer");
                System.out.println("6. Print History");
                System.out.println("7. Quit");
                System.out.println("*****************");
                try (Scanner scanner = new Scanner(System.in)) {
                    int userSelect =  scanner.nextInt();
                    switch (userSelect) {
                        case 1: 
                            System.out.println("Selected: Create Account");
                            return MenuOption.CREATE_ACCOUNT;
                        case 2: 
                            System.out.println("Selected: Withdraw");
                            return MenuOption.WITHDRAW;
                        case 3: 
                            System.out.println("Selected: Deposit");
                            return MenuOption.DEPOSIT;
                        case 4: 
                            System.out.println("Selected: Print");
                            return MenuOption.PRINT;
                        case 5: 
                            System.out.println("Selected: Transfer");
                            return MenuOption.TRANSFER;
                        case 6: 
                            System.out.println("Selected: Print History");
                            return MenuOption.PRINT_HISTORY;
                        case 7: 
                            System.out.println("Selected: Quit");
                            return MenuOption.QUIT;
                        default: 
                            throw new Exception("ERROR: Select one of the options");
                    }
                }
            } catch (Exception e) { System.out.println(e.getMessage()); }
        } while (true);
    }

    //FUNCTIONS
    public static void CreateAccount(vsct vsct) throws Exception {
        System.out.println("Name of the account: ");
        try (Scanner nameScanner = new Scanner(System.in)) {
            String Name = nameScanner.next();
            System.out.println("Initial balance: ");
            try (Scanner balanceScanner = new Scanner(System.in)) {
                double Balance = balanceScanner.nextDouble();
                if (Balance < 0)
                    throw new Exception("ERROR: Initial balance cannot be a negative number");
                else {
                    Account account = new Account(Name, Balance);
                    vsct.AddAccount(account);
                    System.out.println("You have successfully created an account");
                    System.out.println(account.getName() + ", Welcome!");
                }
            }
        }
    }

    public static Account FindAccount(vsct vsct) {
        System.out.println("Name of the account: ");
        try (Scanner nameScanner = new Scanner(System.in)) {
            String name = nameScanner.next();
            Account account = vsct.GetAccount(name);
            if (account == null) System.out.println("Error: Account does not exist");
            else System.out.println("Account found!");
            return account;
        }
    }

    public static void DoRollback(vsct vsct) throws Exception {
        System.out.println("Choose translation to roll back: ");
        try (Scanner tranNum = new Scanner(System.in)) {
            int choice = tranNum.nextInt();
            Transaction transaction = vsct.GetTransaction(choice);
            if (transaction != null) transaction.Rollback();
        }
    }

    public static void DoPrintHistory(vsct vsct) throws Exception {
        vsct.PrintTransactionHistory(); DoRollback(vsct);
    }

    public static void DoDeposit(vsct vsct) throws Exception {
        Account account = FindAccount(vsct);
        System.out.println("Deposit amount: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double amount = scanner.nextDouble();
            deposit = new DespositTransaction(account, amount);
        }
        vsct.ExecuteTransaction(deposit);
        deposit.Print();
    }

    public static void DoWithdraw(vsct vsct) throws Exception {
        Account account = FindAccount(vsct);
        System.out.println("Withdraw amount: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double amount = scanner.nextDouble();
            withdraw = new WithdrawTransaction(account, amount);
        }
        vsct.ExecuteTransaction(withdraw);
        withdraw.Print();
    }

    public static void DoTransfer(vsct vsct) throws Exception {
        System.out.println("Host account name: ");
        Account accountFrom = FindAccount(vsct);
        System.out.println("Receiver account name: ");
        Account accountTo = FindAccount(vsct);
        System.out.println("Transfer amount: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double amount = scanner.nextDouble();
            TransferTransaction transfer = new TransferTransaction(accountFrom, accountTo, amount); // Add missing TransferTransaction class
            vsct.ExecuteTransaction(transfer);
            transfer.Print();
        }
    }

    public static void DoPrint(vsct vsct) throws Exception {
        try { Account account = FindAccount(vsct); account.Display(); }
        catch (Exception ignored) {}
    }

    public static void main(String[] args) throws Exception {
        vsct sai = new vsct();
        while(true) {
            switch (ReadMenuOption()) {
                case CREATE_ACCOUNT:
                    CreateAccount(sai);
                    break;
                case WITHDRAW:
                    DoWithdraw(sai);
                    break;
                case DEPOSIT:
                    DoDeposit(sai);
                    break;
                case PRINT:
                    DoPrint(sai);
                    break;
                case TRANSFER:
                    DoTransfer(sai);
                    break;
                case PRINT_HISTORY:
                    DoPrintHistory(sai);
                    break;
                case QUIT:
                    return;
            }
            System.out.println("Press return to continue ...");
            System.in.read();
        }
    }
}
