import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ContaBancaria conta = (ContaBancaria) registry.lookup("ContaBancaria");

            System.out.println("Saldo: R$" + conta.getSaldo());

            conta.depositar(500.0);
            System.out.println("Saldo apos deposito: R$" + conta.getSaldo());

            conta.sacar(200.0);
            System.out.println("Saldo apos saque: R$" + conta.getSaldo());

            conta.sacar(9999.0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
