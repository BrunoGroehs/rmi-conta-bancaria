import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ContaBancariaImpl extends UnicastRemoteObject implements ContaBancaria {

    private double saldo;

    public ContaBancariaImpl(double saldoInicial) throws RemoteException {
        super();
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) throws RemoteException {
        saldo += valor;
        System.out.println("Deposito de R$" + valor + ". Saldo: R$" + saldo);
    }

    @Override
    public boolean sacar(double valor) throws RemoteException {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para sacar R$" + valor);
            return false;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + ". Saldo: R$" + saldo);
        return true;
    }

    @Override
    public double getSaldo() throws RemoteException {
        return saldo;
    }
}
