package tp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_rdv {
	
	public void afficherListeRdv() throws FileNotFoundException {
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesRDV.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	
	public void ajouterRdv() throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesRDV.txt");
		FileWriter writer = new FileWriter(file, true);

		System.out.println("\nId:");
		String id = sc.nextLine();
		writer.write("id:" + id);

		System.out.println("DateRDV:");
		String date_rdv = sc.nextLine();
		writer.write("\ndateRD:" + date_rdv);

		System.out.println("heureRDV:");
		String heureRDV = sc.nextLine();
		writer.write("\nheureRDV:" + heureRDV);
		
		System.out.println("CinPatient:");
		String cinPatient = sc.nextLine();
		writer.write("\ncinPatient:" + cinPatient+"\n");

		System.out.println("RDV ajoute");
		writer.close();

	}
	
	public void supprimerRdv() throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesRDV.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Rdv> rdvList = new ArrayList<Rdv>();
		while (sc.hasNextLine()) {

			String id = sc.nextLine().split(":")[1];
			String date_rdv = sc.nextLine().split(":")[1];
			String heure_rdv = sc.nextLine().split(":")[1];
			String cinP = sc.nextLine().split(":")[1];

			Rdv tmp_rdv = new Rdv(Integer.parseInt(id), date_rdv, heure_rdv, cinP);
			rdvList.add(tmp_rdv);
		}

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer le numero de rdv a supprimer");
		String id_supp = sc2.nextLine();

		Rdv rdv_supp = new Rdv();
		for (int i = 0; i < rdvList.size(); i++) {
			Rdv r = rdvList.get(i);
			if (r.getId()==Integer.parseInt(id_supp)) {
				rdv_supp=r;
				break;

			}
		}
		rdvList.remove(rdv_supp);
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < rdvList.size(); i++) {
			Rdv r = rdvList.get(i);

			int id = r.getId();
			writer.write("id:" + id);

			String date_rdv = r.getDateRDV();
			writer.write("\ndateRD:" + date_rdv);

			String heureRDV = r.getHeureRDV();
			writer.write("\nheureRDV:" + heureRDV);
			
			String cinPatient = r.getCinP();
			writer.write("\ncinPatient:" + cinPatient+"\n");


		}
		writer.close();
		System.out.println("le RDV est supprime");

	}

	
	
	public void modifierRdv() throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesRDV.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Rdv> rdvList = new ArrayList<Rdv>();
		while (sc.hasNextLine()) {

			String id = sc.nextLine().split(":")[1];
			String date_rdv = sc.nextLine().split(":")[1];
			String heure_rdv = sc.nextLine().split(":")[1];
			String cinP = sc.nextLine().split(":")[1];

			Rdv tmp_rdv = new Rdv(Integer.parseInt(id), date_rdv, heure_rdv, cinP);
			rdvList.add(tmp_rdv);
		}

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer le'id de RDV a modifier");
		String id_mod = sc2.nextLine();

		System.out.println("Entrer le nouveau date de RDV");
		String date_mod = sc2.nextLine();
		
		System.out.println("Entrer la nouvelle heure de RDV");
		String heure_mod = sc2.nextLine();

		for (int i = 0; i < rdvList.size(); i++) {
			Rdv r = rdvList.get(i);
			if (r.getId()==Integer.parseInt(id_mod)) {
				r.setDateRDV(date_mod);
				r.setHeureRDV(heure_mod);

			}
		}
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < rdvList.size(); i++) {
			Rdv r = rdvList.get(i);

			int id = r.getId();
			writer.write("id:" + id);

			String date_rdv = r.getDateRDV();
			writer.write("\ndateRD:" + date_rdv);

			String heureRDV = r.getHeureRDV();
			writer.write("\nheureRDV:" + heureRDV);
			
			String cinPatient = r.getCinP();
			writer.write("\ncinPatient:" + cinPatient+"\n");


		}
		writer.close();
		System.out.println("l'ordonnance est modifie");

	};


}
