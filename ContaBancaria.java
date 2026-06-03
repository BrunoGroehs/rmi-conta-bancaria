import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ContaBancaria extends Remote {
    void depositar(double valor) throws RemoteException;
    boolean sacar(double valor) throws RemoteException;
    double getSaldo() throws RemoteException;
}
