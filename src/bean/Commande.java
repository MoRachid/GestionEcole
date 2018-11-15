/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author UPMuser
 */

@Entity
public class Commande implements Serializable {
    private static int position = 0;

    public static int getPosition() {
        return position;
    }

    public static void setPosition(int aPosition) {
        position = aPosition;
    }
    @Id
    private String id;
    private double montant;
    @OneToMany(mappedBy = "commande")
    private ArrayList<Produit> produits;
    @ManyToOne
    private Client client;

    public Commande() {
    }

    public Commande(double montant, ArrayList<Produit> produits, Client client) {
        this.id = generateId();
        this.montant = montant;
        this.produits = produits;
        this.client = client;
    }
    
    
    
      private String generateId() {
        position += 1;
        return "C" + position;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getMontant() {
        return montant;
    }
      
    
      
      

}
