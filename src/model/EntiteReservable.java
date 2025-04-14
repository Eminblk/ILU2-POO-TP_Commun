package model;

public abstract class EntiteReservable<T extends Formulaire> {
    private CalendrierAnnuel calendrier; 
    private int numero;           
    
    protected EntiteReservable(int numero) {
        this.numero = numero;
        this.calendrier = new CalendrierAnnuel();
    }
    public CalendrierAnnuel getCalendrier() {
        return calendrier;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean estLibre(T formulaire) {
        return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
    }
    public abstract boolean compatible(T formulaire);
    public abstract Reservation reserver(T formulaire);
}
