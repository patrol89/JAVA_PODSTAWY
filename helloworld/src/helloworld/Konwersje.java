package helloworld;

public class Konwersje {
	public static void main (String[] agrs){
		int a1 = 5;
		double b1 = 13.5;
		double c1 = b1/a1;
		//System.out.println(c1);

// Rzutowanie (jawna konwersja)
		
		int d1 = (int)b1/a1;
		System.out.println(d1);
		


		double x = 15.0, y = 5.0;
		byte b;
		int i;
		char ch,ch1; 
		
		// rzutowanie z double do int

		i = (int) (x/y);
		System.out.println("Wynik x/y oraz rzutowania do int to: " + i);

		// rzutowanie z int do byte

		i = 129;
		b = (byte) i; //zakres typu byte : -128 do 127
		System.out.println("Wynik rzutowania int do byte to: " + b);

		// rzutowanie z byte do char

		b = 67;
		ch = (char) b;
		System.out.println("Wynik rzutowania z byte do char to: " + ch);
		System.out.println();

		b = 10; // byte
		i = b * b; // daje nam typ int
		System.out.println("Wynik rzutowania jest typu int: " + i);

		b = 9;
		b = (byte)(b * b); // rzutujemy spowrotem do typu byte
		System.out.println("Wynik rzutowania jest teraz typu byte: " + b);

		ch = 'A';
		ch1 = 'h';
		ch = (char)(ch + ch1);
		System.out.println("Wynik rzutowania typu char z powrotem do typu char to: " + ch);
		
		
		
			}

}
