package helloworld;

public class ZakresWidocznosciZmiennych {
	void metoda(){
	      if(0==1){
	         int a=5;
	      }
	   //tutaj zmienna "a" jest niewidoczna
	 
	  for(int i=0; i<10; i++){  //zmienna obowiązuje tylko w pętli
	    System.out.println("Java");
	  }
	}
}
