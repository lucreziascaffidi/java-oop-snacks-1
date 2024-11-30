package snack2;

// Classe
public class ContoBancario {
    private int accountNumber;
    private double bankBalance;

    // Metodo costruttore
    public ContoBancario(int accountNumber) {
        this.accountNumber = accountNumber;
        this.bankBalance = 0.0;
    }

    // Metodo per depositare denaro
    public void depositare(double importo) {
        if (importo > 0) {
            bankBalance += importo;
            System.out.println("Deposito di " + importo + " effettuato con successo");
        } else {
            System.out.println("L'importo del deposito deve essere positivo.");
        }
    }

    // Metodo per prelevare denaro
    public void prelevare(double importo) {
        if (importo > 0 && importo <= bankBalance) {
            bankBalance -= importo;
            System.out.println("Prelievo di " + importo + " effettuato con successo.");
        } else if (importo > bankBalance) {
            System.out.println("Fondi insufficienti per il prelievo.");
        } else {
            System.out.println("L'importo del prelievo deve essere positivo.");
        }
    }

    // Metodo per controllare il saldo corrente
    public double getBankBalance() {
        return bankBalance;
    }

    // Metodo per ottenere il numero di conto
    public int getAccountNumber() {
        return accountNumber;
    }

}