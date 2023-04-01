package tp2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Driver_patient {

public static void main(String[] args) throws IOException {
Scanner sc=new Scanner(System.in);
int choix;
Gestion_patient gestionp = new Gestion_patient();

System.out.println("---------------------------------------------");
System.out.println("1- Afficher la liste des patients");
System.out.println("2- Ajouter un patient");
System.out.println("3- Modifier les information d'un patient");
System.out.println("4- Supprimer un patient");
System.out.println("---------------------------------------------");

do {
System.out.println("Saisir votre choix");
choix=sc.nextInt();
}while(!((choix>=1)&&(choix<=4)));
switch(choix) {
case 1:
gestionp.afficherListePatients();
break;
case 2:
gestionp.ajouterPatient();
break;
case 3:
gestionp.modifierPatient();
break;
case 4:
gestionp.supprimerPatient();
break;
}


}
}
