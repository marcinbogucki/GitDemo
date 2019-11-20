package InterfaceConcept;

//w interfejsie znajda sie metody ktore musza byc potem opracowane przez developera
public interface BankingClient {

	void zaplacKartakredytowa(); // definicja metody bez zawartosci opisu dzialania
	void transferBalance();		// opis dzialania bedzie w klasach implementujacych interfejs
	void sprawdzSaldo();		//  metody sa domyslnie publiczne
}
