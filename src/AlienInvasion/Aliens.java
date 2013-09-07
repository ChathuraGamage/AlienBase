package AlienInvasion;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Aliens {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int inputNum,base,temp;
        String message,s; 
        
        
        WarningSignal signal= new WarningSignal();
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        
        inputNum=Integer.parseInt(br.readLine());
        for(int i=0;i<inputNum;i++){
            message=br.readLine();
            base=signal.countBase(message);
                        
            writer.println(("Case #"+(i+1)+": "+signal.translate(message, base)));
            

        }
        writer.close();
        
    }
}
