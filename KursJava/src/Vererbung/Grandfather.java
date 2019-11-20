package Vererbung;

public class Grandfather {

	public static void main(String[] args) {
		// Dziedziczenie- metody ktore sa czesto uzywane mozna zebrac tematycznie w jednej klasie
		// i pozniej poprostu uzywac przez wywolanie tych metod bez potrzeby pisania ich na nowo
		//
	}
	
	int i=5;
	
	public void city() //metoda klasy nadrzednej
	{
		System.out.println("Warszawa");
	}
	public void country()//metoda klasy nadrzednej
	{
		System.out.println("India");
	}
	
}
