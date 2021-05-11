import java.util.*;
public class entretient {
	protected int Id_avion;

	protected Date date;
	protected double Heure;
	protected boolean Entretient ; 
	entretient(){ 
	try {
	    Scanner LireClavier = new Scanner(System.in);
	    date = new Date();
	    System.out.println("donner la Id_avion: ");
	    Id_avion = LireClavier.nextInt();
	    System.out.println(" donner la Date");
	    date.saisir_date();
	    System.out.println("donner l'Heure: ");
	    Heure = LireClavier.nextDouble();
	    System.out.println("Entretient: ");
	    Entretient = LireClavier.nextBoolean();   
	} catch (InputMismatchException LE) {
	    System.out.println("entree detectee est invalide");  
	}}}
