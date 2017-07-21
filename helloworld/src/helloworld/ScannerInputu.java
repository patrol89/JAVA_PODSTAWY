/*
 * class Klasa{
 * void metoda{
 * int zmienna;
  }
}
*/

package helloworld;

import java.util.Scanner;

public class ScannerInputu {
	public static void main (String[] args){
		
		String imie; 
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Proszę podać imię");
		
		imie = odczyt.nextLine();
		System.out.println("Witaj "+imie);
		
		//nextInt() - odczytuje kolejną liczbę całkowitą

		//nextDouble() - czyta kolejną liczbę zmiennoprzecinkową (uwaga, separatorem może być tutaj zarówno kropka jak i przecinek - wszystko zależy od standardu kraju na jaki ustawiona jest maszyna wirtualna - można to ustawić za pomocą metody useLocale(Locale))		
		
		// API klasy Scanner 
		// http://docs.oracle.com/javase/1.5.0/docs/api/java/util/Scanner.html
	}

}
