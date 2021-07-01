
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
public interface ChatClient extends Remote{
    public void postText(String nick, String cText) throws RemoteException;
    public String getNick() throws RemoteException;
    
}
