
package train.ticket.reservation.system;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public  class Ticket extends Person implements Serializable{
    private int ID_Ticket;
    private String distination , Source;
    private int Price;
    protected String line;
    private String datestr;
    
    private static ArrayList<Ticket> serveT = new ArrayList<Ticket>();
    
    private  int []NoOfPassengerInLines =new int[3];
    
    private final String FilePath = "PassengerTicket.bin";
    
    
    public final void SetDate(String date)
    {//int day , int month , int year , int hour , int min
        String Sepreted[] = date.split("#");
        this.datestr=Sepreted[0] +"#"+ Sepreted[1] + "#"+Sepreted[2]+"#"+Sepreted[3]+"#"+Sepreted[4];
    }
    public final String getDate()
    {
        return this.datestr;
    }
    private final void SetNoOfPassengerInLines(/*String line*/)
    {
//            if(line.equals("Line 1"))
//                        NoOfPassengerInLines[0]++;
//            else if(line.equals("Line 2"))
//                    NoOfPassengerInLines[1]++;
//            else if(line.equals("Line 3"))
//                    NoOfPassengerInLines[2]++;
        LoadFromFile();
        for(Ticket t : serveT){
            if(t.line.equals("Line 1"))
                        NoOfPassengerInLines[0]++;
            else if(t.line.equals("Line 2"))
                        NoOfPassengerInLines[1]++;
            else if(t.line.equals("Line 3"))
                        NoOfPassengerInLines[2]++;
        }
        
    }
    public final int[] NoOfPassenger()
    {
        SetNoOfPassengerInLines();
        return NoOfPassengerInLines;
    }
    public final ArrayList<Ticket> ListTicket()
    {
        LoadFromFile();
        return serveT;
    }
    public Ticket(){
    
    }
    public Ticket(String n,String e,String pn,int id,String s,String d)
    {
        this.Name=n;
        this.Email=e;
        this.PhoneNo=pn;
        this.ID_Ticket=id;
        this.Source=s;
        this.distination=d;
        if(Arrays.binarySearch(Train.Line1, this.Source)!=-1)
            this.line = "Line 1";
        else if (Arrays.binarySearch(Train.Line2, this.Source)!=-1)
            this.line = "Line 2";
        else if(Arrays.binarySearch(Train.Line3, this.Source)!=-1)
            this.line = "Line 3";
        this.Price=PriceOFTicket(this.line,Source, distination);
    }
    public final void SetLine(String L)
    {
        //SetNoOfPassengerInLines(L);
        this.line = L;
    }
    public final String getLine()
   {
       return this.line;
   }
    
    public final void SetPrice(int p)
    {
        this.Price=p;
    }
    
    
    public final void SetIDTicket(int id)
    {
        this.ID_Ticket=id;
    }
    public final void SelectDistantion(String d)
    {
        this.distination=d;
    }
    public final void SelectSource(String s)
    {
        this.Source=s;
    }
    public final int GetIDTicket()
    {
        return this.ID_Ticket;
    }
    public final String GetDistantion()
    {
        return this.distination;
    }
    public final String GetSource()
    {
        return this.Source;
    }
    public final boolean ServeTicket()
    {
        LoadFromFile();
        serveT.add(this);
        return CommitToFile();
    }
    public final boolean CancelTicket(int id)
    {
        if(SearchIDTicket(id)){
            int index=GetIndexOFTicket(id);
            serveT.remove(index);
            return CommitToFile();
        }
        return false;
    }
    private int GetIndexOFTicket(int id)
    {
        for(int i=0;i<serveT.size();i++)
            if(serveT.get(i).ID_Ticket==id)
                return i;
        return -1;
    }
    private boolean SearchIDTicket(int id)
    {
        LoadFromFile();
        System.out.println(serveT.size());
        for(Ticket t : serveT)
            if(t.ID_Ticket==id)
                return true;
        return false;
    }
    
    public final Ticket getTicket(int id)
    {
        LoadFromFile();
        for(Ticket t : serveT)
            if(t.ID_Ticket==id)
                return t;
        return null;
    }
    
    
    public final boolean EditTicketServed(int id)
    {
        if(SearchIDTicket(id)){
            int index = GetIndexOFTicket(id);
            serveT.set(index,this);
            return CommitToFile();
        }
        return false;
    }
//    private String getTicketFile()
//    {
//        return this.Name+"`"+this.PhoneNo+"`"+this.Email+"`"+this.ID_Ticket+"`"+this.line+"`"+this.Source+"`"+this.distination+"`"+PriceOFTicket(this.line,Source, distination)+"`"+this.datestr+"`";
//    }
    private void LoadFromFile()
    {
        serveT =(ArrayList<Ticket>) FManger.readBinary(FilePath);
    }
    public boolean CommitToFile()
    {
        return FManger.writeBinary(FilePath, serveT);
    }
    
    private String[] getLineStation(String line)
    {
        if(line.equals("Line 1"))
            return Train.Line1;
        else if(line.equals("Line 2"))
            return Train.Line2;
        else if(line.equals("Line 3"))
            return Train.Line3;
        return null;
    }
    private int getIndexOfLine(String []line, String key)
    {
        for(int i=0;i<line.length;i++){
            if(line[i].equals(key))
                return i;
        }
        return -1;
    }
    private int CountStation(String LineKey,String Source , String distination)
    {
        String []Line = getLineStation(LineKey);
        return getIndexOfLine(Line, distination)-getIndexOfLine(Line, Source);
    }
    
    public final int PriceOFTicket(String Line,String Source , String distination)
    {
        if(0<=CountStation(Line,Source, distination)&&CountStation(Line,Source, distination)<9)
            return 3;
        else if(9<=CountStation(Line,Source, distination)&&CountStation(Line,Source, distination)<15)
            return 5;
        else 
            return 7;
        
    }
    
    
    public boolean DublicateIDTicket(int idTicket)
    {
        LoadFromFile();
        for( Ticket a : serveT)
            if(a.ID_Ticket==idTicket)
                return true;
        return false;
    }
    
    @Override
    public boolean LogIn(String Username , String Password) {
        return false;
    }
    
    
}
