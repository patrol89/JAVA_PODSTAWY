import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
 
public class BinarnyZapisOdczyt{
    public static void main(String[] args){
        try{
            DataOutputStream strumieñ = new DataOutputStream(new FileOutputStream("BinarnyZapisOdczyt.txt"));
            /*
             * Dowolne
             * metody
             * 
             */
            strumieñ.close();   
        } catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch(IOException e){
            System.out.println("B³¹d wejœcia-wyjœcia");
        }
    }
}