import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
 
public class BinarnyZapisOdczyt{
    public static void main(String[] args){
        try{
            DataOutputStream strumie� = new DataOutputStream(new FileOutputStream("BinarnyZapisOdczyt.txt"));
            /*
             * Dowolne
             * metody
             * 
             */
            strumie�.close();   
        } catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch(IOException e){
            System.out.println("B��d wej�cia-wyj�cia");
        }
    }
}