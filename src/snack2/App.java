package snack2;

public class App {

    public static void main(String[] args) {
        ContoBancario mioContoBancario = new ContoBancario(123445);

        System.out.println("Numero conto" + mioContoBancario.getAccountNumber());
        System.out.println("Saldo iniziale: " + mioContoBancario.getBankBalance());

        mioContoBancario.depositare(400.00);
        System.out.println("Saldo dopo deposito:" + mioContoBancario.getBankBalance());

        mioContoBancario.prelevare(300.00);
        System.out.println("Saldo dopo prelievo:" + mioContoBancario.getBankBalance());

    }
}
