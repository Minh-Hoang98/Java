
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hai Anh
 */
public class ChatServerImpl extends UnicastRemoteObject implements ChatServer{
    Vector<ChatClient> cList=new Vector<ChatClient>(10,10); 
    
    public ChatServerImpl() throws RemoteException{}
    
    public void addNick(ChatClient c) throws RemoteException{
        cList.add(c);
        sendText(c,c.getNick()+" enter room.");
    }
    public void sendText(ChatClient c, String msg) {
        for(ChatClient cc:cList){
            try {
                cc.postText(c.getNick(),msg);
            } catch (RemoteException ex) {
                Logger.getLogger(ChatServerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    
//----------------------------------------------------------------------------
public static void main(String[] a) {
        try {
            ChatServer srv = new ChatServerImpl();      // Create an instance of the server.
            LocateRegistry.createRegistry(1199);
            Naming.rebind("rmi://LanhNV:1199/CS", srv);
        } catch (Exception ex) {
            Logger.getLogger(ChatServerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
    
    
}
