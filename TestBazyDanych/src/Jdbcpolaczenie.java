import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcpolaczenie {

	public static void main(String[] args) throws SQLException {
		
		String host= "localhost";
		String port="3306";
		//wzor dla parametru url-     "jdbc:mysql://"+host":"+port+"/databasename";
		//informacje o bazie danych przypisuje zmiennej typu Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root", "Vererbung");
		
		//tworzymy wyrazenie do egzekwowania kwerend
				Statement s= con.createStatement();
		
		
	
	}

}
