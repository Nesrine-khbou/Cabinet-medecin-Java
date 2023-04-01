package tp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_ordonnance {
	
	public void afficherListeOrdonnances() throws FileNotFoundException {
		File file = new File("C:\\Users\\MSI\\Documents\\Ordonnances.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	
	public void ajouterOrdonnance() throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\MSI\\Documents\\Ordonnances.txt");
		FileWriter writer = new FileWriter(file, true);

		System.out.println("\nNumOrd:");
		String numOrd = sc.nextLine();
		writer.write("NumOrd:" + numOrd);

		System.out.println("NomPatient:");
		String nomp = sc.nextLine();
		writer.write("\nNomPatient:" + nomp);

		System.out.println("PrenomPatient:");
		String prenomp = sc.nextLine();
		writer.write("\nPrenomPatient:" + prenomp);
		
		System.out.println("NomMedicament:");
		String NomMedicament = sc.nextLine();
		writer.write("\nDosageMedicament:" + NomMedicament);

		System.out.println("DosageMedicament:");
		String DosageMedicament = sc.nextLine();
		writer.write("\nDosageMedicament:" + DosageMedicament+"\n");


		System.out.println("ordonnance ajoute");
		writer.close();

	}
	
	public void supprimerOrdonnance() throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\Ordonnances.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Ordonnance> ordonnanceList = new ArrayList<Ordonnance>();
		while (sc.hasNextLine()) {

			String numOrd = sc.nextLine().split(":")[1];
			String nomp = sc.nextLine().split(":")[1];
			String prenomp = sc.nextLine().split(":")[1];
			String NomMedicament = sc.nextLine().split(":")[1];
			String DosageMedicament = sc.nextLine().split(":")[1];

			Ordonnance tmp_ord = new Ordonnance(Integer.parseInt(numOrd), nomp, prenomp, NomMedicament,Integer.parseInt( DosageMedicament));
			ordonnanceList.add(tmp_ord);
		}

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer le numero d'ordonnace a supprimer");
		String num_ord_supp = sc2.nextLine();

		Ordonnance ord_supp = new Ordonnance();
		for (int i = 0; i < ordonnanceList.size(); i++) {
			Ordonnance o = ordonnanceList.get(i);
			if (o.getNumOrd()==Integer.parseInt(num_ord_supp)) {
				ord_supp=o;
				break;

			}
		}
		ordonnanceList.remove(ord_supp);
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < ordonnanceList.size(); i++) {
			Ordonnance o = ordonnanceList.get(i);

			int numOrd = o.getNumOrd();
			writer.write("NumOrd:" + numOrd);

			String nomp = o.getNomPatient();
			writer.write("\nNomPatient:" + nomp);

			String prenomp = o.getPrénomPatient();
			writer.write("\nPrenomPatient:" + prenomp);
			
			String NomMedicament = o.getNomMédicament();
			writer.write("\nDosageMedicament:" + NomMedicament);

			int DosageMedicament = o.getDosageMédicament();
			writer.write("\nDosageMedicament:" + DosageMedicament+"\n");


		}
		writer.close();
		System.out.println("l'ordonnance est supprime");

	}

	
	
	public void modifierOrdonnance() throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\Ordonnances.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Ordonnance> ordonnanceList = new ArrayList<Ordonnance>();
		while (sc.hasNextLine()) {

			String numOrd = sc.nextLine().split(":")[1];
			String nomp = sc.nextLine().split(":")[1];
			String prenomp = sc.nextLine().split(":")[1];
			String NomMedicament = sc.nextLine().split(":")[1];
			String DosageMedicament = sc.nextLine().split(":")[1];

			Ordonnance tmp_ord = new Ordonnance(Integer.parseInt(numOrd), nomp, prenomp, NomMedicament,Integer.parseInt( DosageMedicament));
			ordonnanceList.add(tmp_ord);
		}


		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer le numero d'ordonnace a modifier");
		String num_ord_mod = sc2.nextLine();

		System.out.println("Entrer le nouveau nom de medicament");
		String nom_med_mod = sc2.nextLine();
		
		System.out.println("Entrer le nouveau dosage");
		String dosage_mod = sc2.nextLine();

		for (int i = 0; i < ordonnanceList.size(); i++) {
			Ordonnance o = ordonnanceList.get(i);
			if (o.getNumOrd()==Integer.parseInt(num_ord_mod)) {
				o.setNomMédicament(nom_med_mod);
				o.setDosageMédicament(Integer.parseInt(dosage_mod));

			}
		}
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < ordonnanceList.size(); i++) {
			Ordonnance o = ordonnanceList.get(i);

			int numOrd = o.getNumOrd();
			writer.write("NumOrd:" + numOrd);

			String nomp = o.getNomPatient();
			writer.write("\nNomPatient:" + nomp);

			String prenomp = o.getPrénomPatient();
			writer.write("\nPrenomPatient:" + prenomp);
			
			String NomMedicament = o.getNomMédicament();
			writer.write("\nDosageMedicament:" + NomMedicament);

			int DosageMedicament = o.getDosageMédicament();
			writer.write("\nDosageMedicament:" + DosageMedicament+"\n");


		}
		writer.close();
		System.out.println("l'ordonnance est modifie");

	};


}
