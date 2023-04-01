package tp2;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Espace_medecin {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\MSI\\Documents\\authentification_medecin.txt");
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

				System.out.println("---------------Espace Medecin---------------");
				System.out.println("1- Gestion Des Ordonnances");
				System.out.println("2- Log Out");

				do {
					System.out.println("Saisir votre choix");
					choix = sc.nextInt();
				} while (!((choix >= 1) && (choix <= 2)));

				switch (choix) {
				case 1:
					Driver_ordonnance dro = new Driver_ordonnance();
					dro.main(args);

					break;
				case 2:
					System.exit(0);
					break;
				}
			}

		}

	}

}
