package helloworld;

public class Funkcje {
	public static void main (String[] args){
		double liczba = 9.0;
		int b = 3;
		double pierwiastek =  Math.sqrt(liczba);
		double  potega = Math.pow(liczba, b);
		
		System.out.println("pierwiastek z "+liczba+" wynosi: "+pierwiastek);
		System.out.println("liczba "+liczba+" podniesiona do potęgi "+b+" to: "+potega);
	}

}
