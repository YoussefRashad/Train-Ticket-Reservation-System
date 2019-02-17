
package train.ticket.reservation.system;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author x Youssef Rashad x
 */
public class TnenMogn7Client implements Serializable{
    Socket s = null;
    ObjectOutputStream os = null;
    ObjectInputStream ois = null;
    public final void sendDataToServer(String FilePath , Object data) //write in socket
    {
        try {
            
            s = new Socket(TrainTicketReservationSystem.LOCAL_IP,TrainTicketReservationSystem.PORT);
            os = new ObjectOutputStream(s.getOutputStream());
            os.writeInt(0);// To execute this Function 
            os.writeObject(FilePath);
            os.writeObject(data);
            
        } catch (IOException ex) {
            System.out.println("Error in Connection by Youssef : " + ex);
        }
        finally{
            closeConnection();
        }
    }
    
    public final Object recieveDataFromServer(String FilePath) // return data to Client
    {
        Object data=null;
        try {
            
            s = new Socket(TrainTicketReservationSystem.LOCAL_IP,TrainTicketReservationSystem.PORT);
            
            os = new ObjectOutputStream(s.getOutputStream());
            os.writeInt(1);// To execute this Function
            os.writeObject(FilePath);
            
            ois = new ObjectInputStream(s.getInputStream());
            data = ois.readObject();
            System.out.println(data.toString());
            ois.close();
        } catch (IOException ex) {
            System.out.println("Error in Connection by Youssef : " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error in FNF by Youssef : " + ex);
        }
        finally{
            closeConnection();
        }
        return data;
    }
    
    public void resetConnection() {
            os = null;
            ois = null;
            s = null;
    }
    
    public void closeConnection() {
        try {
            os.close();
            s.close();
        } catch (IOException ex) {
            System.out.println("Error in Closing by Youssef : " + ex);
        }
    }
    
}
