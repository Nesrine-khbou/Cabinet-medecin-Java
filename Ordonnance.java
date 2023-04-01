package tp2;

public class Ordonnance {
private int NumOrd;
private String NomPatient;
private String PrénomPatient;
private String NomMédicament;
private int DosageMédicament;

public Ordonnance() {}

public Ordonnance(int numOrd, String nomPatient, String prénomPatient,
String nomMédicament, int dosageMédicament) {
super();
NumOrd = numOrd;
NomPatient = nomPatient;
PrénomPatient = prénomPatient;
NomMédicament = nomMédicament;
DosageMédicament = dosageMédicament;
}

public void setNumOrd(int numOrd) {
NumOrd = numOrd;
}
public int getNumOrd() {
return NumOrd;
}
public String getNomPatient() {
return NomPatient;
}
public String getPrénomPatient() {
return PrénomPatient;
}
public String getNomMédicament() {
return NomMédicament;
}
public int getDosageMédicament() {
return DosageMédicament;
}
public void setNomPatient(String nomPatient) {
NomPatient = nomPatient;
}
public void setPrénomPatient(String prénomPatient) {
PrénomPatient = prénomPatient;
}
public void setNomMédicament(String nomMédicament) {
NomMédicament = nomMédicament;
}
public void setDosageMédicament(int dosageMédicament) {
DosageMédicament = dosageMédicament;
}

public String toString() {
return("Numero ordonnance: "+NumOrd+" Nom patient: "+NomPatient+" Prenom patient: "+PrénomPatient+" Nom Mdedicament: "+NomMédicament+" Dosage: "+DosageMédicament);
}
}