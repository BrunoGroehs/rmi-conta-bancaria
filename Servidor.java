import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main(String[] args) {
        try {
            ContaBancariaImpl conta = new ContaBancariaImpl(1000.0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ContaBancaria", conta);

            System.out.println("Servidor iniciado. Saldo inicial: R$1000.00");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
