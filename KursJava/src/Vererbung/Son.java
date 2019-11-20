package Vererbung;

public class Son extends Grandfather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s=new Son();
		
		s.city(); 	//dostep do metod i pol klasy grandfather dzieki slowu extends
		s.country();
		System.out.println(s.i);// przyklad dostepu do pola
	}
	
	public void sonactivities()
	{
		System.out.println("dzialanie Syna");
	}
}