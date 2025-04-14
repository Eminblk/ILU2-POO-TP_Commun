package model;

public class ReservationRestaurant extends Reservation {
    private int numeroService;  
    private int numeroTable;

    public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
        super(jour, mois);
        this.numeroService = numeroService;
        this.numeroTable = numeroTable;
    }
    
    @Override
    public String toString() {
        String serviceStr = (numeroService == 1) ? "premier service" : "deuxi�me service";
        return "Le " + getJour() + "/" + getMois() + "\nTable " + numeroTable + " pour le " + serviceStr + ".";
    }
}
