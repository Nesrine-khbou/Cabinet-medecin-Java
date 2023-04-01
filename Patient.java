package tp2;

public class Patient {
private String cin;
private String nom;
private String prenom;
private String adresse;
private String age;
private String tel;


public Patient() {}
public Patient(String cin, String nom, String prenom, String adresse,String age,
String tel) {
super();
this.cin = cin;
this.nom = nom;
this.prenom = prenom;
this.adresse = adresse;
this.age = age;
this.tel = tel;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getCin() {
return cin;
}
public void setCin(String cin) {
this.cin = cin;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}
public String getAdresse() {
return adresse;
}
public void setAdresse(String adresse) {
this.adresse = adresse;
}
public String getTel() {
return tel;
}
public void setTel(String tel) {
this.tel = tel;
}
public String toString() {
return "Patient [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom
+ ", adresse=" + adresse + ", tel=" + tel + "]";
}





}
