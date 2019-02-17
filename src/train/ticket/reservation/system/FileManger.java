
package train.ticket.reservation.system;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public final class FileManger {
    public boolean Write (String Query , String FilePath , boolean append)
    {
        PrintWriter Writter = null;
        try{
            System.out.print("\nwritting in ! " + FilePath);
            Writter = new PrintWriter(new FileWriter(new File(FilePath),append));
            Writter.println(Query);
            System.out.println(" ... Done ! ");
            return true;
        }
        catch(IOException em)
        {
            System.out.println("Error in Writting : "+em);
        }
        finally{
            Writter.close();
        }
        return false;
    }
    
    
    public ArrayList<Object> Read (String FilePath)
    {
        Scanner Reader= null;
        try{
            System.out.println("Reading ! From " + FilePath);
            Reader = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error in Reading by Youssef : "+e);
        }
        
        if(FilePath.equals("Employee.txt")){
            ArrayList<Employee>Employees = new ArrayList<Employee>();
            Employee emp;
           
            while(Reader.hasNext()){
                emp = new Employee();
                String line = Reader.nextLine();
                String Sepreted []= line.split("`");
                // Name ` ID `  Username ` Password ` Qualificaion ` Salary ` Age ` Gender ` PhoneNo ` Email ` 
                emp.SetName(Sepreted[0]);
                emp.SetID(Integer.parseInt(Sepreted[1]));
                emp.SetUsername(Sepreted[2]);
                emp.SetPassword(Sepreted[3]);
                emp.SetQualification(Sepreted[4]);
                emp.SetSalary(Double.parseDouble(Sepreted[5]));
                emp.SetAge(Integer.parseInt(Sepreted[6]));
                emp.SetGender(Sepreted[7]);
                emp.SetPhoneNo(Sepreted[8]);
                emp.SetEmail(Sepreted[9]);
                Employees.add(emp);
                
            }
            return (ArrayList<Object>) (Object) Employees;
        }
        
        else if(FilePath.equals("Train.txt")){
            ArrayList<Train>Trains = new ArrayList<Train>();
            Train t;
            while(Reader.hasNext()){
                t = new Train();
                String line = Reader.nextLine();
                String []Sepreted = line.split("`");
                //ID_Train ` Line ` OriginPoint ` EndPoint ` Date `
                t.SetID_Train(Integer.parseInt((Sepreted[0])));
                t.SetLine(Sepreted[1]);
                //t.SetNoOfPassengerInLines(Sepreted[1]);
                t.setOriginPoint(Sepreted[2]);
                t.setEndPoint(Sepreted[3]);
                t.SetDate(Sepreted[4]);
                Trains.add(t);
            }
            return (ArrayList<Object>)(Object)Trains;           
        }
        
        
        else if(FilePath.equals("PassengerTicket.txt")){
            ArrayList<Ticket>tickets = new ArrayList<Ticket>();
            Ticket t;
            while(Reader.hasNext()){
                t = new Ticket();
                String line = Reader.nextLine();
                String []Sepreted = line.split("`");
                //Name ` PhoneNo ` Email ` ID_Ticket ` Line ` Source ` distnation ` Price ` Date
                t.SetName(Sepreted[0]);
                t.SetPhoneNo(Sepreted[1]);
                t.SetEmail(Sepreted[2]);
                t.SetIDTicket(Integer.parseInt(Sepreted[3]));
                t.SetLine(Sepreted[4]);
                //t.SetNoOfPassengerInLines(Sepreted[4]);
                t.SelectSource(Sepreted[5]);
                t.SelectDistantion(Sepreted[6]);
                t.SetPrice(Integer.parseInt(Sepreted[7]));
                t.SetDate(Sepreted[8]);
                tickets.add(t);
            }
            return (ArrayList<Object>)(Object)tickets;
        }
        else if (FilePath.equals("Admin.txt")){
            ArrayList<Admin>admins = new ArrayList<Admin>();
            Admin ad ;
            while(Reader.hasNext()){
                ad = new Admin();
                String Line = Reader.nextLine();
                String []Sepreted=Line.split("`");
                
            // Name ` ID `  Username ` Password ` Qualificaion ` Salary ` Age ` Gender ` PhoneNo ` Email ` 
                ad.SetName(Sepreted[0]);
                ad.SetID(Integer.parseInt(Sepreted[1]));
                ad.SetUsername(Sepreted[2]);
                ad.SetPassword(Sepreted[3]);
                ad.SetQualification(Sepreted[4]);
                ad.SetSalary(Double.parseDouble(Sepreted[5]));
                ad.SetAge(Integer.parseInt(Sepreted[6]));
                ad.SetGender(Sepreted[7]);
                ad.SetPhoneNo(Sepreted[8]);
                ad.SetEmail(Sepreted[9]);
                admins.add(ad);
                
            }
            
            return (ArrayList<Object>)(Object)admins;
        }
        else if(FilePath.equals("Email.txt")){
            ArrayList<Mail> mails = new ArrayList<Mail>();
            Mail m ;
            while(Reader.hasNext()){
                m = new Mail();
                String Line = Reader.nextLine();
                String Seprated[]=Line.split("`");
                
                // ToEmail ` CcEmail ` Subject ` Emailbody `
                
                m.setToEmail(Seprated[0]);
                m.setCcEmail(Seprated[1]);
                m.setSubject(Seprated[2]);
                m.setEmailbody(Seprated[3]);
                mails.add(m);
            }
            return (ArrayList<Object>)(Object)mails;
            
        }
        
        return null;
        
    }
    
}
