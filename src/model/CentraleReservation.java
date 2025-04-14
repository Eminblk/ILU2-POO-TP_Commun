package model;

public class CentraleReservation<T extends EntiteReservable<U>, U extends Formulaire> {
    
    private T[] entites;
    private int nbEntites;
    public CentraleReservation(T[] entites) {
        this.entites = entites;
        this.nbEntites = 0;
    }
    public int ajouterEntite(T entite) {
        int nouveauNumero = ++nbEntites;
        entite.setNumero(nouveauNumero);
        entites[nbEntites - 1] = entite;
        return nouveauNumero;
    }
    public int[] donnerPossibilites(U formulaire) {
        int[] possibilites = new int[entites.length];
        for (int i = 0; i < nbEntites; i++) {
            if (entites[i].compatible(formulaire) && entites[i].estLibre(formulaire)) {
                possibilites[i] = entites[i].getNumero();
            } else {
                possibilites[i] = 0;
            }
        }
        return possibilites;
    }
    public Reservation reserver(int numero, U formulaire) {
        for (int i = 0; i < nbEntites; i++) {
            if (entites[i].getNumero() == numero) {
                formulaire.setIdentificationEntite(numero);
                return entites[i].reserver(formulaire);
            }
        }
        return null;
    }
}
