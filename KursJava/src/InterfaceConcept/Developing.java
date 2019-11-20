package InterfaceConcept;

//klasa musi zaimplementowac wszystkie metody z Interfejsu BankingKlient!!!
// w klasie Developimg 

public class Developing implements BankingClient,DomainClient {

	public static void main(String[]args)
	{
		//tworzy obiekt Klasy Developing  ma dostep do metod interfejsu i tych zdefiniowanych w klasie 
		Developing develop= new Developing();
		develop.zaplacKartakredytowa();
		develop.login();
		
		//Tworze obiekt typu DomainClient
		DomainClient ds=new Developing(); //ma dostep tylko do metod z interfejsu DomainClient
		ds.investment();
		
		// POLIMORFIZM POLIMORFIZM POLIMORFIZM POLIMORFIZM POLIMORFIZM POLIMORFIZM
		// Tworzy obiekt Typu Bankingclient , ma dostep tylko do metod tych w interfejsie
		BankingClient dr=new Developing(); // dr.login(); nie ma dostepu
		
	}
	@Override
	public void zaplacKartakredytowa() {
		// TODO Auto-generated method stub
		System.out.println("metoda placenia karta zaimplementowana");
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("metoda transfer zaimplementowana");
	}

	@Override
	public void sprawdzSaldo() {
		// TODO Auto-generated method stub
		System.out.println("metoda saldo zaimplementowana");
	}
	
	public void login()
	{
		System.out.println("Zalogowano");
	}
	@Override
	public void investment() { //metoda zaimplementowana z interfejsu DomainClient
		// TODO Auto-generated method stub
		System.out.println("zainwestuj cos (metoda zaimplementowana w klasie Domainclient");
	}
}
