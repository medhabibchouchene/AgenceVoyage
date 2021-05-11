import java.util.*;

public class billet {
protected String Referance;

protected String Nom;
protected String Prenom;
protected int Num_Vol;
protected Date date;
billet(){ 
try {
    Scanner LireClavier = new Scanner(System.in);
    System.out.println("veuillez saisir les information a propos cette voyage");

    System.out.println("donner la Referance: ");
    Referance = LireClavier.next();
    System.out.println(" donner le nom");
    Nom = LireClavier.next();

    System.out.println("donner la prénom: ");
    Prenom = LireClavier.next();

    System.out.println("donner le num de vol: ");
    Num_Vol = LireClavier.nextInt();
    
} catch (InputMismatchException LE) {
    System.out.println("entree detectee est invalide");
  
}
}}
