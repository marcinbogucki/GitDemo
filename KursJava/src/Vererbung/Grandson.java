package Vererbung;

public class Grandson extends Son {	// jezeli extends Grandfather to nie ma dostepu do metod z Son	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grandson gs= new Grandson(); 
		//dziedziczenie wielokrotne, klasa Grandson ma dostep do metod z obu klas--> Son i Granfather
		gs.sonactivities();//metoda z sohn
		gs.country();//metoda z grandfather
	}
}
