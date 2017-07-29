package programowanie_obiektowe;

public class Firma {
	public static void main(String args[]){
		Pracownik[] pracownicy = new Pracownik[3];
		
		String[] imiona = {"W³odek", "Staszek", "Ziutek"};
		String[] nazwiska = {"Zieba", "Kowalski", "Pawelski"};
		int[] wiek = {54, 43, 56};
		
		for(int i=0; i< pracownicy.length; i++){
			pracownicy[i] = new Pracownik();
			pracownicy[i].imie = imiona[i];
			pracownicy[i].nazwisko = nazwiska[i];
			pracownicy[i].wiek = wiek[i];
		}
		
		System.out.println("Pracownicy firmy to:");
		for(int i=0; i< pracownicy.length; i++){
			System.out.println(pracownicy[i].imie+" "+pracownicy[i].nazwisko+", "+pracownicy[i].wiek+" lat.");
		}	
	}
}
