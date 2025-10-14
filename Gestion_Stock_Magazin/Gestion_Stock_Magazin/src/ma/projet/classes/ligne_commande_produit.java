package ma.projet.classes;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ligne_commande_produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantite;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private produit produit;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private commande commande;

    public ligne_commande_produit(int quantite, produit produit, commande commande) {
        this.quantite = quantite;
        this.produit = produit;
        this.commande = commande;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public produit getProduit() {
        return produit;
    }

    public void setProduit(produit produit) {
        this.produit = produit;
    }

    public commande getCommande() {
        return commande;
    }

    public void setCommande(commande commande) {
        this.commande = commande;
    }
    
    
    
}
