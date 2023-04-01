package tp2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Driver_rdv {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int choix;
		Gestion_rdv gestionr = new Gestion_rdv();

		System.out.println("---------------------------------------------");
		System.out.println("1- Afficher la liste des RDVs");
		System.out.println("2- Ajouter un RDV");
		System.out.println("3- Modifier la date et l'heure d'un RDV");
		System.out.println("4- Supprimer un RDV");
		System.out.println("---------------------------------------------");


		do {
		System.out.println("Saisir votre choix");
		choix=sc.nextInt();
		}while(!((choix>=1)&&(choix<=4)));
		switch(choix) {
		case 1:
		gestionr.afficherListeRdv();
		break;
		case 2:
		gestionr.ajouterRdv();
		break;
		case 3:
		gestionr.modifierRdv();
		break;
		case 4:
		gestionr.supprimerRdv();
		break;
		}

	}

}
