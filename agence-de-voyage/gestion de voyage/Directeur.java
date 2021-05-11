import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Directeur  {
	String formationDem="";
	String formationValid="";
	String nomp="";
	String url = "jdbc:mysql://localhost:3306/agence de vouyage";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	ResultSet rs =null;
	Scanner Lire = new Scanner(System.in);
	public void lister() throws ClassNotFoundException, SQLException {

	// Etape 1 : Chargement du driver
	Class.forName("com.mysql.jdbc.Driver");

	// Etape 2 : recuperation de la connexion
	cn = DriverManager.getConnection(url, login, passwd);

	// Etape 3 : Creation d'un statement
	st = cn.createStatement();
	
	// Etape 4 : execution requete
	rs = st.executeQuery("SELECT * FROM `vol`");
	// Si recup donnees alors etapes 5 (parcours Resultset)

	while (rs.next()) {
		nomp= rs.getString("name");
		System.out.println(nomp);

	}//while
}
	public void showElm(String name) throws ClassNotFoundException, SQLException {

	// Etape 1 : Chargement du driver
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("donner  id ");
	int id = Lire.nextInt();
	// Etape 2 : recuperation de la connexion
	cn = DriverManager.getConnection(url, login, passwd);

	// Etape 3 : Creation d'un statement
	st = cn.createStatement();
	
	// Etape 4 : execution requete
	rs = st.executeQuery("SELECT * FROM `vol` WHERE id="+id);
	// Si recup donnees alors etapes 5 (parcours Resultset)

	while (rs.next()) {
		nomp= rs.getString("name");
		System.out.println(nomp);

	}//while
}	
}
