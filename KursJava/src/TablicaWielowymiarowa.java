import java.util.Random;

public class TablicaWielowymiarowa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int tab[][]=new int[3][3]; //deklaracja tablicy 5x5
			
			int tab2[][]=wypelnijTablice(tab);
			wyswietlTablice(tab2);
			wyszukajMinimum(tab2);
	}
	
			public static int[][] wypelnijTablice(int tab[][])
			{
				Random generator = new Random();
				for(int i=0;i<tab.length;i++)
				{
					for(int j=0;j<tab.length;j++)
					{
						tab[i][j]=generator.nextInt(25);
					}
				}
				return tab;
			}
			
			public static int[][] wyswietlTablice(int tab2[][])
			{
				System.out.println("Moja wielowymiarowa tablica losowa ");
				for(int i=0;i<tab2.length;i++)
				{
					for(int j=0;j<tab2.length;j++)
					{
						System.out.print(tab2[i][j]+" ");
						
					}
					System.out.println();
				}
				return tab2;
			}
			
			public static void wyszukajMinimum (int tab2[][])
			{
				int wiersz=0;
				int kolumna=0;
				int minimum=tab2[0][0];//pomocnicza  zmienna( pierwszy element tablicy)
				
				for(int i=0;i<tab2.length;i++)
				{
					for(int j=0;j<tab2.length;j++)
					{
						if(tab2[i][j]<minimum)
						{
							minimum=tab2[i][j];
							wiersz=i;
							kolumna=j;
						}
					}
				}
				System.out.println("Najmiejsza liczba w tablicy: "+minimum);
				System.out.println("znajduje sie w " +"wiersz "+(wiersz)+" kolumna "+(kolumna));
				
				//przeszukaj minimum w kolumnie (iteruje tylko numer wiersza)
				int maksimum = minimum;
				for(int i=0;i<tab2.length;i++)
				{
					System.out.println(tab2[i][kolumna]);
					if (tab2[i][kolumna]>maksimum)
					{
						maksimum=tab2[i][kolumna];
					}
				}
				System.out.println("Najwieksza liczba w rzedzie "+kolumna+ " wynosi " +maksimum);
			}
	
}
	
