package programowanie_obiektowe;

public class UstawPunkt {
	public static void main(String args[]){
		Punkt punkt = new Punkt();
		punkt.ustawX(10);
		punkt.ustawY(20);
		
		System.out.println("Wspó³rzêdne punktu to ("+punkt.dajX()+", "+punkt.dajY()+")");
	}
}
