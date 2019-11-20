import java.util.ArrayList;
import java.util.List;

public class EdycjaStringow {

	public static void main(String[] args) {
		
		//sprawdz czy napis $100 zawiera  znak dolara
		
		String str ="Zaplacono 100$";// jednoznaczne co String str = new String("Zaplacono 100$")
		if(str.contains("$"))
			
		System.out.println("tekst zawiera dolara ");
		System.out.println("Teraz nowa wersja");
		
		
		else
			System.out.println("test brancha develop");
		
		System.out.println("znak na 13 pozycji :"+ str.charAt(13));
		System.out.println("znak $ znajduje sie na pozycji "+ str.indexOf("$"));
		System.out.println(str.substring(4,9));// znaki 4 do 9
		
	}

}
