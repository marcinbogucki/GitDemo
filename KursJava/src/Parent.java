
public class Parent {

	public static void main(String[] args) {
		
		//semicolon-strichpunkt 			--> ;
		// slash - Schr�gstrich				--> //	
		//cudzyslow -Anf�hrungszeichen		--> "
		// validate -Best�tigen	
		// encapsulacja - die Datenkapselung 	--> chowanie danych (private,public,protected)
		//dziedziczenie - die vererbung	     	--> super klase , subclase //uzywane dla podobnych objektow
		//Interface - Schnittstelle		der Teil eines Systems, welcher der Kommunikation dient

		//Interfejs w kontekscie programowania w jezyku Java to zestaw metod bez ich implementacji 
		// (bez kodu definiujacego zachowanie metody)
		
		Metoda klasa= new Metoda();		//obiekt klasy metoda
		klasa.validateHeader();			//objekt.metoda() dostep do metody klasy 
		double liczba= klasa.zwrocLiczbe();
		System.out.println(klasa.zwrocNapis());
		klasa.wyswietlPowitanie();
	}
}
