
public class ReverseString {

	public static void main(String[] args) {

		// String jest obiektem !!!!!!
		String s = "Marcin2";
		
		char x = '2';
		ReverseString obiekt=new ReverseString();
		
		String s2=obiekt.odwrocNapis(s, x);//odwroc
		obiekt.wyswietlNapis(s);
		obiekt.sprawdzNapis(s, s2);
		obiekt.wyswietlNapisWstecz(s2);
		obiekt.znajdzPozycje(s,x);
	}

	public String odwrocNapis(String s, char x) {
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i); // napis od tylu
		}
		return s2;
	}

	public  void wyswietlNapis(String s) {
		System.out.println("napis: " + s);
	}

	public  void sprawdzNapis(String s, String s2) {
		if (s == s2) {
			System.out.println("Napisy sa takie same");
		} else
			System.out.println("Napisy nie sa takie same");
	}

	public  void wyswietlNapisWstecz(String s2) {

		System.out.println("Napis od tylu: " + s2);
	}
	
	public 	void znajdzPozycje(String s,char x)
	{
		for (int i =0; i<s.length(); i++) {
			if (s.charAt(i) == x)//sprawdz na ktorej pozycji w napisieznajduje sie znak 2
			{
				System.out.println("liczba " + x + " jest na pozycji " + i);
				break; //jak znalazl to przestan szukac :)
			}
		}
	}
}
