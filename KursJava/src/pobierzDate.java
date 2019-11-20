import java.text.SimpleDateFormat;
import java.util.Date;

public class pobierzDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
