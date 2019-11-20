import java.io.*; 
// Java code to demonstrate star pattern
public class Test { 
// Function to demonstrate printing pattern 
	
		public static void main (String args[])
		{
			Test gwiazdki = new Test();
			gwiazdki.printTriagle(13);
		}
		
		public static void printTriagle(int n) { 
			// zewnetrzna petla do liczby wierszy
			// n -liczba wierszy 
			
			for (int i=0; i<n; i++) {  // poki i < liczby wierszy 
				// petla do liczenia liczby spacji
				// wartosc rosnio 
				for (int j=n-i; j>1; j--) {  // j = liczba wierszy minus jeden, dopoki j> 1 wyswietl spacje
					System.out.print(" "); 
					} 
				
				// wewnetrzna petla do obslugi liczby kolumn
				for (int j=0; j<=i; j++ ) { //dopoki j <= numeru wiersza
					// wyswiet gwiazdke
					System.out.print("* "); 
					} 
		
				// przejscie do nowej linii po kazdym wierszu
				System.out.println(); 
				} 
		}
	}
		
