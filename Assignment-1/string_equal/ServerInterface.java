import java.rmi.*;

public interface ServerInterface extends Remote {
	boolean isEqual(String s1, String s2) throws RemoteException;

	String concat(String s1, String s2) throws RemoteException; // New method
}
