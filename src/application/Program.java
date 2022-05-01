package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = teclado.nextInt();

        System.out.print("Enter account holder: ");
        teclado.nextLine();
        String holder = teclado.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = teclado.next().charAt(0);

        if (response == 'y') {

            System.out.print("Enter initial deposit value: ");
            double initialDeposit = teclado.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("");
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double amount = teclado.nextDouble();

        account.deposit(amount);

        System.out.println("");
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        amount = teclado.nextDouble();

        account.withdraw(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

    }

}
