package helloworld;

public class Petle {
	 public static void main(String[] args){
		/*
	  	Pętlę while najczęściej wykorzystuje się w miejscach, 
	  	gdzie zakładana ilość powtórzeń jest bliżej nieokreślona, 
	  	ale znamy warunek jaki musi być spełniony
	  	*/
		  int licznik = 0;
		  while(licznik<10){
	          System.out.println("To jest petla"+licznik);
	          licznik++;
	      }
	          System.out.println("Koniec pętli");
	          
	      /*
	       * Różni się ona od pętli while przede wszystkim tym, 
	       * że to co znajduje się w jej wnętrzu wykona się przynajmniej raz, 
	       * ponieważ warunek jest sprawdzany dopiero w drugiej kolejności    
	       */
	      licznik = 0;
	      do{
	    	  System.out.println("To jest petla"+licznik);
	    	  licznik++;
	          }
	          while(licznik<10);
	          System.out.println("Koniec pętli");    
	          
	      /*
	       * Pętlę for od dwóch poprzednich odróżnia przede wszystkim 
	       * rodzaj zastosowań. W jej przypadku zazwyczaj wiemy dokładnie ile razy ma się jakaś czynność powtórzyć.     
	       */
	       for(int i=0; i<10; i++){
	    	   System.out.println("To jest pętla");
	       }
	       System.out.println("Koniec pętli");
	  }
}
