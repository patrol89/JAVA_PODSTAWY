package helloworld;

public class TabliceWielowymiarowe {
	public static void main (String[] args) {
		int[][] tablica1 = new int [3][3];
		tablica1[2][1] = 5;
		//inicjacja zmiennej z tablicy
		int zmienna = tablica1[2][1];
		System.out.println(zmienna);
	
		//tablica nie musi być symetryczna
		int[][] tablicaniesym = new int[3][];
		tablicaniesym[0] = new int[3];
		tablicaniesym[1] = new int[2];
		tablicaniesym[2] = new int[1];
		
		for(int i=0; i< tablicaniesym.length; i++){
		    for(int j=0; j< tablicaniesym[i].length; j++)
		        System.out.print(tablicaniesym[i][j]);
		    System.out.println();
		}
		    
		//ustawienie tej samej wartosci w wszystkich polach tablicy    
		int[][] tablica2 = new int [3][3];
		for(int i=0; i< tablica2.length; i++)
			for(int j=0; j< tablica2[i].length; j++)
				tablica2[i][j] = 1;
		for(int i=0; i< tablica2.length; i++){
		    for(int j=0; j< tablica2[i].length; j++)
		        System.out.print(tablica2[i][j]);
		    System.out.println();
		}
			
	}
}
