package model;

public class ReservationSpectacle extends Reservation {
    private int numeroZone;
    private int numeroChaise;
    
    public ReservationSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
        super(jour, mois);
        this.numeroZone = numeroZone;
        this.numeroChaise = numeroChaise;
    }
   
    public String toString() {
        return "Le " + getJour() + "/" + getMois() + "\nPlace en zone n°" + numeroZone 
                + ", chaise n°" + numeroChaise + ".";
    }
}
