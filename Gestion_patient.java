package tp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_patient {
	public Gestion_patient() {
	};

	public void afficherListePatients() throws FileNotFoundException {
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesPatients.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	};

	public void ajouterPatient() throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesPatients.txt");
		FileWriter writer = new FileWriter(file, true);

		System.out.println("\nCIN:");
		String cin = sc.nextLine();
		writer.write("CIN:" + cin);

		System.out.println("Nom:");
		String nom = sc.nextLine();
		writer.write("\nNom:" + nom);

		System.out.println("Prenom:");
		String prenom = sc.nextLine();
		writer.write("\nPrenom:" + prenom);

		System.out.println("Age:");
		String age = sc.nextLine();
		writer.write("\nAge:" + age);

		System.out.println("Adresse:");
		String adresse = sc.nextLine();
		writer.write("\nAdresse:" + adresse);

		System.out.println("Tel:");
		String tel = sc.nextLine();
		writer.write("\nTel:" + tel+"\n");

		System.out.println("parient ajoute");
		writer.close();

	};

	public void modifierPatient() throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesPatients.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		while (sc.hasNextLine()) {

			String cin = sc.nextLine().split(":")[1];
			String nom = sc.nextLine().split(":")[1];
			String prenom = sc.nextLine().split(":")[1];
			String age = sc.nextLine().split(":")[1];
			String addresse = sc.nextLine().split(":")[1];
			String tel = sc.nextLine().split(":")[1];

			Patient tmp_patient = new Patient(cin, nom, prenom, addresse, age, tel);
			patientList.add(tmp_patient);
		}

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer le cin du patient a modifier");
		String cin_mod = sc2.nextLine();
		System.out.println("Entrer le tel du patient a modifier");
		String tel_mod = sc2.nextLine();

		for (int i = 0; i < patientList.size(); i++) {
			Patient p = patientList.get(i);
			if (p.getCin().equals(cin_mod)) {
				p.setTel(tel_mod);

			}

		}
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < patientList.size(); i++) {
			Patient p = patientList.get(i);

			String cin = p.getCin();
			writer.write("CIN:" + cin);

			String nom = p.getNom();
			writer.write("\nNom:" + nom);

			String prenom = p.getPrenom();
			writer.write("\nPrenom:" + prenom);

			String age = p.getAge();
			writer.write("\nAge:" + age);

			String adresse = p.getAdresse();
			writer.write("\nAdresse:" + adresse);

			String tel = p.getTel();
			writer.write("\nTel:" + tel+"\n");
		}
		writer.close();
		System.out.println("le numero de telephone de client est modifie");

	};

	public void supprimerPatient() throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\ListedesPatients.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		while (sc.hasNextLine()) {

			String cin = sc.nextLine().split(":")[1];
			String nom = sc.nextLine().split(":")[1];
			String prenom = sc.nextLine().split(":")[1];
			String age = sc.nextLine().split(":")[1];
			String addresse = sc.nextLine().split(":")[1];
			String tel = sc.nextLine().split(":")[1];

			Patient tmp_patient = new Patient(cin, nom, prenom, addresse, age, tel);
			patientList.add(tmp_patient);
		}

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Entrer le cin du patient a supprimer");
		String cin_supp = sc2.nextLine();

		Patient p_supp = new Patient();
		for (int i = 0; i < patientList.size(); i++) {
			Patient p = patientList.get(i);
			if (p.getCin().equals(cin_supp)) {
				p_supp=p;
				break;

			}
		}
		patientList.remove(p_supp);
		FileWriter writer = new FileWriter(file);
		for (int i = 0; i < patientList.size(); i++) {
			Patient p = patientList.get(i);

			String cin = p.getCin();
			writer.write("CIN:" + cin);

			String nom = p.getNom();
			writer.write("\nNom:" + nom);

			String prenom = p.getPrenom();
			writer.write("\nPrenom:" + prenom);

			String age = p.getAge();
			writer.write("\nAge:" + age);

			String adresse = p.getAdresse();
			writer.write("\nAdresse:" + adresse);

			String tel = p.getTel();
			writer.write("\nTel:" + tel+"\n");
		}
		writer.close();
		System.out.println("le patient est supprime");

	}
	}
