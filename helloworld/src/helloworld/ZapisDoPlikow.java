package helloworld;

//ODCZYT
import java.io.File;
import java.util.Scanner;
//ZAPIS
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ZapisDoPlikow {
		  public static void main(String[] args) throws FileNotFoundException{
		      //ZAPIS
			  PrintWriter zapis = new PrintWriter("PlikPlaski.txt");
		      zapis.println("Ala ma kota, a kot ma Alę");
		      zapis.close();
		      
		      //ODCZYT
		      File file = new File("PlikPlaski.txt");
		      Scanner in = new Scanner(file);
		      String zdanie = in.nextLine();
		      System.out.println(zdanie);
	   }
}
