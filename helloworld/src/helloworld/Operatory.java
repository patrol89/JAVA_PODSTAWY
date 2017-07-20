package helloworld;

public class Operatory {
	public static void main(String[] args){
	      int a = 17;
	      int b = 4;
	      int c = a+b; //=21
	      c = a-b;     //=13
	      c = a*b;     //=68
	      c = a/b;     //=4 ponieważ 4*4=16 i zostaje reszty 1
	      //c = a%b;     //=1 reszta z dzielenia
	     
	      int d = (a+b)/3;  //=7
	      
	      double e = 4.0;
	      double f = a/e; //=4.25

	      
	      // OPERACJE PREFIXOWE I POSTFIXOWE
	      int a1 = 5;
	      int b1 = 3;
	      int c1 = a1+b1++; //c=a+b, a dopiero później b = b+1;
	          c1 = (a1++)+b1; //c=a+b, a następnie a = a+1
	      
	      //DZIAŁANIE OPERATORÓW: 
	      int a2 = 5;
	      int b2 = 3;
	      boolean prawda = a2>b2; //prawda=true
	      boolean falsz = a2<b2;  //falsz=false
	      boolean porownanie = a2==b2;  //porownanie=false
	      boolean koniunkcja = (a2>b2)&&(a2!=b2); //true prawda i prawda = prawda	      
	         
	      
	      String ja = "Slawek";
	      String ty = "Slawek";
	      boolean porownanie1 = ja==ty;
	      boolean porownanie2 = ja.equals(ty);
	      System.out.println(porownanie1);
	      System.out.println(porownanie2);
	           
		  }
	
	

}
