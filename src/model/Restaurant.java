package model;
import model.CalendrierAnnuel;
public class Restaurant {
	
	public class Table{
		
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;
		
		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}
		
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			int jour = formulaireRestaurant.getJour();
			int mois = formulaireRestaurant.getMois();
			return CalendrierAnnuel.reserver(jour, mois); 
		}
	
		
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			int nbPersonne = formulaireRestaurant.getNombrePersonnes();
			int jour = formulaireRestaurant.getJour();
			int mois = formulaireRestaurant.getMois();
			return (nbChaises == nbPersonne && (nbChaises+1) == nbPersonne && /*EstLibre(jour, mois )*/   );
		}
	}
	
	public int ajouterTable(int nbChaise) {
		
	}

}
