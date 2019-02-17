package train.ticket.reservation.system;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Person implements Serializable{
    protected String Name ,Gender,Email,PhoneNo , Username,Qualificaion,Password;
    protected int ID,Age;
    protected double Salary;
    protected FileMangerBinary FManger = new FileMangerBinary();

    public Person()    {
        
    }
    public Person(String user,String pass,String qualification,double salary,String name , String email, String gender, int id,int age,String pn)
    {
        this.Username=user;
        this.Password=pass;
        this.Salary=salary;
        this.Qualificaion=qualification;
        this.Name=name;
        this.Email=email;
        this.Age=age;
        this.Gender=gender;
        this.ID=id;
        this.PhoneNo=pn;
    }
    public final void SetUsername(String u)
    {
        this.Username=u;
    }
    public final void SetPassword(String p)
    {
        this.Password=p;
    }
    public final void SetSalary(double s)
    {
        this.Salary=s;
    }
    public final void SetQualification(String q)
    {
        this.Qualificaion=q;
    }
    public final String GetUsername()
    {
        return this.Username;
    }
    public final String GetPassword()
    {
        return this.Password;
    }
    public final double GetSalary()
    {
        return this.Salary;
    }
    public final String GetQualification()
    {
        return this.Qualificaion;
    }
    public final void SetName(String n)
    {
        this.Name=n;
    }
    public final void SetID(int id)
    {
        this.ID=id;
    }
    public final void SetAge(int a)
    {
        this.Age=a;
    }
    public final void SetGender(String g)
    {
        this.Gender=g;
    }
    public final void SetPhoneNo(String pn)
    {
        this.PhoneNo=pn;
    }
    public final void SetEmail(String e)
    {
        this.Email=e;
    }
    public final String GetName()
    {
        return this.Name;
    }
    public final int GetID()
    {
        return this.ID;
    }
    public final int GetAge()
    {
        return this.Age;
    }
    public final String GetGender()
    {
        return this.Gender;
    }
    public final String GetPhoneNo()
    {
        return this.PhoneNo;
    }
    public final String GetEmail()
    {
        return this.Email;
    }
    
    public abstract boolean LogIn(String username , String Pass) ; //fyha tzbyt kter
    
    
    
}
    
