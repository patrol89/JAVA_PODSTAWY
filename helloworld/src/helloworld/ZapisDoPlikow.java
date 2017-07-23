package helloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZapisDoPlikow {
	public static void main(String[] args) throws FileNotFoundException{
	      File file = new File("plikplaski.txt");
	      Scanner in = new Scanner(file);
	      String zdanie = in.nextLine();
	      System.out.println(zdanie);
}
}
