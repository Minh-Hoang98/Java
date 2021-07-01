
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hai Anh
 */
public interface ChatServer extends Remote{
    public void addNick(ChatClient c) throws RemoteException;
    public void sendText(ChatClient c, String msg) throws RemoteException;
    
}
