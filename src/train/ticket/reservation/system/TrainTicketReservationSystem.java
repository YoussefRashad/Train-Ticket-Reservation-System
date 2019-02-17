package train.ticket.reservation.system;
import GUI.Login;
import java.io.File;

public class TrainTicketReservationSystem {
     /*public boolean checkName(String PN)
    {
        if(checkNo(PN) && (PN.length()==11 ||
            ( PN.length()==11 || PN.lengeth()==10 && ( PN.contains("02-")||PN.contains("03-")||PN.contains("04-")||PN.contains("05-") ) ) )
                && !PN.contains("."))
            return true;
        return false;
    }*/
    public static final int PORT = 3000;
    public static final String LOCAL_IP = "127.0.0.1";
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); 				
	checkDirectoryContents(currentDir);
        
        new Login().setVisible(true);
        Validation x = new Validation();

        /*if(x.checkName("youssefrashad"))
            System.out.println("true 1");
        else 
            System.out.println("Error 1");
        if(x.checkName("youssef rashad"))
            System.out.println("true 2");
        else 
            System.out.println("Error 2");
        if(x.checkName("youssefrashad19@yahoo.con"))
            System.out.println("true 3");
        else 
            System.out.println("Error 3");
        if(x.checkName("youssefrashad  "))
            System.out.println("true 4");
        else 
            System.out.println("Error 4");
        if(x.checkName("youssef  rashad"))
            System.out.println("true 5");
        else 
            System.out.println("Error 5");
        if(x.checkName(" youssefrashad"))
            System.out.println("true 6");
        else 
            System.out.println("Error 6");
        if(x.checkName("you ssef ra sh ad "))
            System.out.println("true 7");
        else 
            System.out.println("Error 7");
        if(x.checkName("youssefrashad19787@g@yahoo.com"))
            System.out.println("true 8");
        else 
            System.out.println("Error 8");
        if(x.checkName(projectPath))
            System.out.println("true 9");
        else 
            System.out.println("Error 9");
        if(x.checkName("asdasdasd6565656565"))
            System.out.println("true 10");
        else 
            System.out.println("Error 10");
        if(x.checkName("asdasdasd you ss 2ef rash. ad"))
            System.out.println("true 11");
        else 
            System.out.println("Error 11");
        if(x.checkName("YOusSssef_rashad"))
            System.out.println("true 12");
        else 
            System.out.println("Error 12");
        if(x.checkName("2121-4540.1"))
            System.out.println("true 13");
        else 
            System.out.println("Error 13");
        if(x.checkName("youssef_rashad19.."))
            System.out.println("true 14");
        else 
            System.out.println("Error 14");//sdfsdf8dfg^^-*`@gmail.com
        if(x.checkName("sdfsdf8dfg^^-*`@gmail.com"))
            System.out.println("true 15");
        else 
            System.out.println("Error 15");*/
        /*if(x.checkName("454554545454.015"))
            System.out.println("true 1");
        else 
            System.out.println("Error 1");*/
       /*
      int m=0;
        for(char i=0;i<128;i++,m++)
            System.out.println(i+"  "+m);
       
     /*   String Str = new String("Welcome to Tutorialspoint.com"); 
	System.out.print("Return Value :" ); 
	System.out.println(Str.matches("(.*)Tutorials(.*)")); 
	System.out.print("Return Value :" ); 
	System.out.println(Str.matches("Tutorials")); 
	System.out.print("Return Value :" ); 
	System.out.println(Str.matches("Welcome(.*)")); 
        
        */
       
     
       /*if(x.checkName("01126728146"))
            System.out.println("true 1");
        else 
            System.out.println("Error 1");
        if(x.checkName("01126728146-"))
            System.out.println("true 2");
        else 
            System.out.println("Error 2");
        if(x.checkName("01126728146"))
            System.out.println("true 3");
        else 
            System.out.println("Error 3");
        if(x.checkName("02 35428516"))
            System.out.println("true 4");
        else 
            System.out.println("Error 4");
        if(x.checkName("011-26728146"))
            System.out.println("true 5");
        else 
            System.out.println("Error 5");
        if(x.checkName("01126-28146"))
            System.out.println("true 6");
        else 
            System.out.println("Error 6");
        if(x.checkName("02.35428516"))
            System.out.println("true 7");
        else 
            System.out.println("Error 7");
        if(x.checkName("01126/728146"))
            System.out.println("true 8");
        else 
            System.out.println("Error 8");
        if(x.checkName(projectPath))
            System.out.println("true 9");
        else 
            System.out.println("Error 9");
        if(x.checkName("011267281468"))
            System.out.println("true 10");
        else 
            System.out.println("Error 10");
        if(x.checkName("011267281466"))
            System.out.println("true 11");
        else 
            System.out.println("Error 11");
        if(x.checkName("09126728146"))
            System.out.println("true 12");
        else 
            System.out.println("Error 12");
        if(x.checkName("02 3542..16"))
            System.out.println("true 13");
        else 
            System.out.println("Error 13");
        if(x.checkName("02-35...516"))
            System.out.println("true 14");
        else 
            System.out.println("Error 14");//sdfsdf8dfg^^-*`@gmail.com
        if(x.checkName("sdfsdf8dfg^^-*`@gmail.com"))
            System.out.println("true 15");
        else 
            System.out.println("Error 15");
        System.out.println();
**/
        
        
    }
    
    public static void checkDirectoryContents(File dir)
    {
        
        File[] files = dir.listFiles();
        boolean EmpFile = true;
        boolean AdminFile = true;
        boolean TrainFile = true;
        boolean TicketFile = true;
        boolean MailFile = true;

        
        for (File file : files) {
            if (file.getName().contains("Employee.bin"))
                EmpFile = false;
            if(file.getName().contains("PassengerTicket.bin"))
                TicketFile = false;
            if(file.getName().contains("Train.bin"))
                TrainFile = false;
            if(file.getName().contains("Email.bin"))
                MailFile = false;
            if(file.getName().contains("Admin.bin"))
                AdminFile = false;
            
            } 
        if(EmpFile){
            new Employee().CommitToFile();
        }
        if(AdminFile)
        {
            new Admin().CommitToFile();
        }
        if(TrainFile)
        {
            new Train().CommitToFile();
        }
        if(TicketFile)
        {
            new Ticket().CommitToFile();
        }
        if(MailFile)
        {
            new Mail().commitToFile();
        }

        
    }
    
}