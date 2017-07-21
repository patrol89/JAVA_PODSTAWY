package helloworld;

public class InstrukcjeSterujace {
	public static void main (String[] agrs){
		int zmienna = 4;
		if (zmienna%2 == 0)
			System.out.println("liczba parzysta");
		else
			System.out.println("liczba nieparzysta");
		
		if (zmienna>10)
			System.out.println("liczba większa od 10");
		else if (zmienna>0 && zmienna<=10)
			System.out.println("Liczba dodatnia mniejsza, lub równa 10");
		else 
			System.out.println("liczba ujemna");
		
		
		
	      int zmiennasw = 1;
	      
	      switch(zmiennasw){
	      case 1:
	          System.out.println("Liczba to 1");
	          break;
	      case 2:
	          System.out.println("Liczba to 2");
	          break;
	      default:
	          System.out.println("Liczba to ani 1, ani 2");
	      }
		
	}

}
