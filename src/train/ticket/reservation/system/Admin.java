
package train.ticket.reservation.system;
import java.io.Serializable;
import java.util.ArrayList;

public final class Admin extends Person implements Serializable{

    
    private static ArrayList<Admin> admin = new ArrayList<Admin>();
    
    /*private final String CheckUserName = "Admain";
    private final String CheckUserPass = "00A00";
    */
    private final String FilePath = "Admin.bin";
    
    public ArrayList<Admin>ListAdmins()
    {
        LoadFromFile();
        return admin;
    }
    
    public boolean AddAdmin()
    {
        LoadFromFile();
        admin.add(this);
        return CommitToFile();
    }
    public boolean RemoveAdmin(int id)
    {
        if(SearchForAdmin(id)){
            int index = getIndexofAdmin(id);
            admin.remove(index);
            return CommitToFile();
        }
        return false;
    }
    
    
    private int getIndexofAdmin(int id)
    {
        //LoadFromFile();
        for(int i = 0 ;i<admin.size();i++)
            if(admin.get(i).ID==id)
                return i;
        return -1;
    }
    private boolean SearchForAdmin(int id)
    {
        LoadFromFile();
        for(int i = 0 ;i<admin.size();i++)
            if(admin.get(i).ID==id)
                return true;
        return false;
    }
    public boolean EditInAdmin( int id)
    {
        if(SearchForAdmin(id)){
            int index = getIndexofAdmin(id);
            admin.set(index,this);
            return CommitToFile();
        }
        return false;
    }
    public Admin getAdmin(int id)
    {
        LoadFromFile();
        for(int i = 0 ;i<admin.size();i++)
            if(admin.get(i).ID==id)
                return admin.get(i);
        return null;
    }
//    private String getAdminFile()
//    {
//        return this.Name+ "`" +this.ID+ "`" +this.Username+ "`" +this.Password+ "`" +this.Qualificaion+ "`" +this.Salary+"`"+this.Age+ "`" +this.Gender+ "`" +this.PhoneNo+ "`" +this.Email+ "`" ;
//    }
    private void LoadFromFile()
    {
        admin = (ArrayList<Admin>)FManger.readBinary(FilePath);
    }
    public boolean CommitToFile()
    {
        return FManger.writeBinary(FilePath, admin);
        
    }
    
    public boolean Dublicate(int id)
    {
        LoadFromFile();
        for(Admin a : admin)
            if(a.ID==id)
                return true;
        return false;
    }
    
    @Override
    public boolean LogIn(String email , String pass) 
    {
        if(email.equals("Admin@yahoo.com") && pass.equals("12345678")) // fy el digram ba3t paremeter
            return true;
        LoadFromFile();
        for(Admin a:admin)
            if(a.Email.equals(email)&&a.Password.equals(pass))
                return true;
        return false;
    }
    
    
    
}
