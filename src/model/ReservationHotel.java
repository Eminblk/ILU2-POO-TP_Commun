package model;

public class ReservationHotel extends Reservation {
    private int nbLitSimple;
    private int nbLitDouble;
    private int numeroChambre;
    public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
        super(jour, mois);
        this.nbLitSimple = nbLitSimple;
        this.nbLitDouble = nbLitDouble;
        this.numeroChambre = numeroChambre;
    }
    public String toString() {
        return "Le " + getJour() + "/" + getMois() + "\nChambre n°" + numeroChambre 
                + " (" + nbLitSimple + " lit(s) simple(s), " + nbLitDouble + " lit(s) double(s)).";
    }
}
