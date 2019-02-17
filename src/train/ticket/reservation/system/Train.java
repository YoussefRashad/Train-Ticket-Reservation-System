
package train.ticket.reservation.system;
import java.io.Serializable;
import java.util.ArrayList;

public final class Train extends Ticket implements Serializable{
    protected int ID_Train;
    protected String OriginPoint,EndPoint;
    public static  final String []Line1 = new String[]{"El Shohadaa","Ahmed Orabi","Naser","Saddat","Saad Zaghlol","El Sayeda Zeinb","El Malk El Saled","Mari Gargis","El Zahraa","Dar El Salam","Haddayk El Maadi","El Maadi","Thakant El Maadi","Tora El Balad","Kozzika","Tora Al-Asmant","El Maasara","Hadayaa Helwan","Wadi Hoof","Helwan University","Ain Helwan","Helwan"};
    public static  final String []Line2 = new String[]{"Shubra","Koleyet El Zeraat","El Mazallat","El Khalafawi","St. Teresa","Rod El Farag","Massara","El Shohadaa","Atatba","M.Naguib","Saddat","Dokki","El Bohoos","Cairo University","Faysal","Giza","Omm El Misryeen","Sakiat Mekki","El Monib"};
    public static  final String []Line3 = new String[]{"Al Ahram","Koleyet El Banat","Cairo Stadium","Cairo Fairgrounds","Abbassiya","Abdou Pasha","El Geish","Bab El Shaaria","Atatba"};
    
    private  int []NoOfTrainInLines =new int[3];

    

    public int[] getNoOfTrainInLines() {
        setNoOfTrainInLines();
        return NoOfTrainInLines;
    }

    private void setNoOfTrainInLines() {
        LoadFromFile();
        for(Train t : train){
            if(t.line.equals("Line 1"))
                NoOfTrainInLines[0]++;
            else if(t.line.equals("Line 2"))
                NoOfTrainInLines[1]++;
            else if(t.line.equals("Line 3"))
                NoOfTrainInLines[2]++;
        }
    }
    
    private static ArrayList<Train>train=new ArrayList<Train>();
    private final String FilePath = "Train.bin";
    
   
    public String getOriginPoint()
    {
        return this.OriginPoint;
    }
    public String getEndPoint()
    {
        return this.EndPoint;
    }
    public  ArrayList<Train> ListTrain()
    {
        LoadFromFile();
        return train;
    }
    public Train(){
        
    }
    
    public Train(int id,String op,String ep) 
    {
        this.OriginPoint=op;
        this.EndPoint=ep;
        this.ID_Train=id;
    }
    
    public int getIndexofTrain(int id)
    {
        for(int i=0;i<train.size();i++)
            if(train.get(i).ID_Train==id)
                return i;
        return -1;
    }
    
    public Train getTrain(int id)
    {
        LoadFromFile();
        for(Train t : train)
            if(t.ID_Train==id)
                return t;
        return null;
       
    }
    public void SetID_Train(int id)
    {
        this.ID_Train=id;
    }
    public void setOriginPoint(String op)
    {
        this.OriginPoint=op;
    }
    public void setEndPoint(String ep)
    {
        this.EndPoint=ep;
    }
    public int GetID_Train()
    {
        return this.ID_Train;
    }
    
    
    public boolean AddTrain()
    {
        LoadFromFile();
        train.add(this);
        return CommitToFile();
    }
    
    public  boolean RemoveTrain(int id)
    {
        if(SearchTrain(id)){
            int index=this.getIndexofTrain(id);
            train.remove(index);
            return CommitToFile();
        }
        return false;
            
    }
    
    public boolean SearchTrain(int id)
    {
        LoadFromFile();
        for(Train t : train)
            if(t.ID_Train==id){
                return true;
            }
        return false;
    }
    
    public boolean EditInTrain(int id)
    {
        if(SearchTrain(id)){
            int index=this.getIndexofTrain(id);
            train.set(index, this);
            return CommitToFile();
        }
        return false;
    }
    
    private void LoadFromFile()
    {
        train = (ArrayList<Train>) FManger.readBinary(FilePath);
    }
    @Override
    public boolean CommitToFile()
    {
        return FManger.writeBinary(FilePath, train);
    }
    
    public boolean Dublicate(int id)
    {
        LoadFromFile();
        for( Train a : train)
            if(a.ID_Train==id)
                return true;
        return false;
    }
}
