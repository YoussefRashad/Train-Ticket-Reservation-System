
package train.ticket.reservation.system;
import java.io.Serializable;
import java.util.ArrayList;

public final class Employee extends Person implements Serializable{
    
    private static ArrayList<Employee> Emp = new ArrayList<Employee>();
    
    //private final String CheckUserName = "Emp";
    //private final String CheckUserPass = "00E00";
    private final String FilePath = "Employee.bin";
    
    
    
    public  ArrayList<Employee> ListAdmins()
    {
        LoadFromFile();
        return Emp;
    }
    public final boolean AddEmployee()
    {
        LoadFromFile();
        Emp.add(this);
        return CommitToFile();
    }
    
    public final boolean RemoveEmployee(int id)
    {
        
        if(SearchForEmployee(id)){
            //LoadFromFile();
            int index = getIndexofEmployee(id);
            Emp.remove(index);
            return CommitToFile();
        }
        return false;
    }
    
    
    private int getIndexofEmployee(int id)
    {
        for(int i=0;i<Emp.size();i++)
            if(Emp.get(i).ID==id)
                return i;
        return -1;
    }
    
    private boolean SearchForEmployee(int id)
    {
        LoadFromFile();
        for(Employee em : Emp)
            if(em.ID==id){
                return true;
            }
        return false;
    }
    
    public Employee getEmp(int id)
    {
        LoadFromFile();
        for(Employee e : Emp)
            if(e.ID==id)
                return e;
        return null;
    }
    public final boolean EditInEmployee(int id)
    {
        if(SearchForEmployee(id)){
            int index=this.getIndexofEmployee(id);
            Emp.set(index, this);
            return CommitToFile();
        }
        return false;
    }
    public boolean Dublicate(int ID)
    {
        LoadFromFile();
        for(Employee a : Emp)
            if(a.ID==ID)
                return true;
        return false;
    }
    
    private void LoadFromFile()
    {
        Emp = (ArrayList<Employee>)FManger.readBinary(FilePath);
    }
    public boolean CommitToFile()
    {
        return FManger.writeBinary(FilePath, Emp);
    }
    @Override
    public boolean LogIn(String email , String pass)
    {
        if(email.equals("Employee@yahoo.com")&&pass.equals("12345678")) // fy el digram ba3t paremeter
            return true;
        LoadFromFile();
        for(Employee e:Emp)
            if(e.Email.equals(email)&&e.Password.equals(pass))
                return true;
        return false;
    }
    
}
