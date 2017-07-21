package helloworld;

import static java.lang.Math.*;
//import statyczny - dzięki jego zastosowaniu mozemy pomijać przedrostki Math przed nazwami funkcji
//double pierwiastek =  sqrt(liczba);
import java.math.BigInteger;


public class Funkcje {
	public static void main (String[] args){
		double liczba = 9.0;
		int b = 3;
		double pierwiastek =  sqrt(liczba);
		double  potega = Math.pow(liczba, b);
		System.out.println("pierwiastek z "+liczba+" wynosi: "+pierwiastek);
		System.out.println("liczba "+liczba+" podniesiona do potęgi "+b+" to: "+potega);
		
//wielkie liczby		
	    BigInteger wielkaLiczba = new BigInteger("12312312312312312312");
	    System.out.println(wielkaLiczba.toString());
	    
	    BigInteger a1 = new BigInteger("123123123123123123123123123123");
	    BigInteger b1 = new BigInteger("987654321987654321987654321987");
	    BigInteger suma = a1.add(b1);
	    System.out.println("Suma "+suma.toString());
	    
	}
;
}
