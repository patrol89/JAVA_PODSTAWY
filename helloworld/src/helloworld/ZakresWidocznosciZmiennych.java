package helloworld;

//Zmienne "globalne" w obr�bie klasy
	class JakasKlasa{
		 int zmienna_globalna = 5;
		 
		 void metoda1(){
		    tutaj mo�esz u�y� zmiennej globalnej
		 }
	}
	
//Zmienne "lokalne" w ramach metod
	class JakasKlasa2{
		  void metoda(){
		      int zmienna_lokalna = 3;
		  }
		 
		  int zmienna_globalna = zmienna_lokalna; //B��D!
		}
	
//Dodatkowo zmienne lokalne mo�na deklarowa� nawet
//wewn�trz instrukcji steruj�cych, lub jako licznik w p�tli
	class JakasKlasa3{
		  void metoda(){
		      if(warunek){
		         int a=5;
		      }
		   //tutaj zmienna "a" jest niewidoczna
		 
		  for(int i=0; i<10; i++){  //zmienna obowi�zuje tylko w p�tli
		    System.out.println("Java");
		  }
		}