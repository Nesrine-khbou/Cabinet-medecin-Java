package tp2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Driver_ordonnance {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int choix;
		Gestion_ordonnance gestiono = new Gestion_ordonnance();
		
		System.out.println("---------------------------------------------");
		System.out.println("1- Afficher la liste des ordonnances");
		System.out.println("2- Ajouter une ordonnance");
		System.out.println("3- Modifier les information d'une ordonnance");
		System.out.println("4- Supprimer une ordonnance");
		System.out.println("---------------------------------------------");


		do {
		System.out.println("Saisir votre choix");
		choix=sc.nextInt();
		}while(!((choix>=1)&&(choix<=4)));
		switch(choix) {
		case 1:
		gestiono.afficherListeOrdonnances();
		break;
		case 2:
		gestiono.ajouterOrdonnance();
		break;
		case 3:
		gestiono.modifierOrdonnance();
		break;
		case 4:
		gestiono.supprimerOrdonnance();
		break;
		}

	}

}
