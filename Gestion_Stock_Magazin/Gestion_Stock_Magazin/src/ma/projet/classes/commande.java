package ma.projet.classes;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "commande")
public class commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "commande", fetch = FetchType.EAGER)
    private List<ligne_commande_produit> ligneCommandeProduits;

    // ✅ Constructor (fixed)
    public commande(Date date, List<ligne_commande_produit> ligneCommandeProduits) {
        this.date = date;
        this.ligneCommandeProduits = ligneCommandeProduits;
    }

    public commande() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // ✅ Getter & Setter (fixed)
    public List<ligne_commande_produit> getLigneCommandeProduits() {
        return ligneCommandeProduits;
    }

    public void setLigneCommandeProduits(List<ligne_commande_produit> ligneCommandeProduits) {
        this.ligneCommandeProduits = ligneCommandeProduits;
    }
}
