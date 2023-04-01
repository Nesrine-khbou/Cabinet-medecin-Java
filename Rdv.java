package tp2;

public class Rdv {
private int id;
private String dateRDV;
private String heureRDV;
private String cinP;


public Rdv() {}

public Rdv(int id, String dateRDV, String heureRDV, String cinP) {
super();
this.id = id;
this.dateRDV = dateRDV;
this.heureRDV = heureRDV;
this.cinP = cinP;
}


public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getDateRDV() {
return dateRDV;
}
public void setDateRDV(String dateRDV) {
this.dateRDV = dateRDV;
}
public String getHeureRDV() {
return heureRDV;
}
public void setHeureRDV(String heureRDV) {
this.heureRDV = heureRDV;
}
public String getCinP() {
return cinP;
}
public void setCinP(String cinP) {
this.cinP = cinP;
}
public String toString() {
return "Rdv [id=" + id + ", dateRDV=" + dateRDV + ", heureRDV="
+ heureRDV + ", cinP=" + cinP + "]";
}






}