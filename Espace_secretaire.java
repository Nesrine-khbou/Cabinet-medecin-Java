package tp2;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Espace_secretaire {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\authentification_secretaire.txt");
		FileReader in = new FileReader(file);
		BufferedReader br = new BufferedReader(in);

		ArrayList<String> t = new ArrayList<String>();

		String s;
		while ((s = br.readLine()) != null) {
			t.add(s);
		}

		System.out.println("********Authentification********");
		Scanner sc = new Scanner(System.in);
		System.out.println("USER:");
		String login = sc.nextLine();

		System.out.println("PASS:");
		String password = sc.nextLine();

		int i = 0;
		boolean test = false;

		while (i < t.size()) {
			String ch = t.get(i);
			String[] tt = ch.split(" ");
			String login2 = tt[0];
			String pass2 = tt[1];
			if ((login.equals(login2)) && (password.equals(pass2))) {
				System.out.println("Authentification reussi");
				test = true;
				break;
			}
			i += 1;
		}
		if (test == false) {
			System.out.println("PB Authentification");
		} else {
			while (true) {
				int choix;

				System.out.println("---------------Espace Secretaire---------------");
				System.out.println("1- Gestion Des Patients");
				System.out.println("2- Gestion Des RDVs");
				System.out.println("3- Log Out");

				do {
					System.out.println("Saisir votre choix");
					choix = sc.nextInt();
				} while (!((choix >= 1) && (choix <= 3)));

				switch (choix) {
				case 1:
					Driver_patient dp = new Driver_patient();
					dp.main(args);
					break;
				case 2:
					Driver_rdv dr = new Driver_rdv();
					dr.main(args);
					break;
				case 3:
					System.exit(0);
					break;
				}
			}

		}

	}

}
