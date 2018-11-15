/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.Produit;
import dao.AbstractFacade;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author UPMuser
 */
public class CommandeService  extends AbstractFacade<Commande>{
    private List<Commande> listeCommande;
    
    
    public CommandeService() {
        super(Commande.class);
    }
    
    int modifierMontant(Commande commande ,double montant){
        if( commande != null){
            commande.setMontant(montant);
            edit(commande);
            return 1;
        }else
            return -1;
    }
    
    
    List<Commande> getCommandesByClient(Client client) {
       listeCommande = findAll();
        for (Commande commande : listeCommande) {
            if(!commande.getClient().equals(client))
                listeCommande.remove(commande);
        }
        
        return listeCommande;
     
    }
    
    List<Commande> getCommandesByClient(int ageMin,int ageMax) {
        
        listeCommande = findAll();
        for (Commande commande : listeCommande) {
            if(commande.getClient().getAge()>= ageMin && commande.getClient().getAge() <= ageMax)
                listeCommande.remove(commande);
        }
        
        return listeCommande;
    }
    
     public double chiffreAffaireByClient(Client client) {
         double chiffre = 0;
         for (Commande commande : listeCommande) {
             if(commande.getClient().equals(client))
               chiffre += commande.getMontant();
         }
         
         return chiffre;
     }
     
        public double chiffreAffaireByProduit(Produit produit) {
         double chiffre = 0;
         for (Commande commande : listeCommande) {
             if(commande.getProduits().equals(produit))
               chiffre += commande.getMontant();
         }
         
         return chiffre;
     }
        
       public Client topClient(Produit produit){
            Commande c = null;
            c =  getSingleResult(" select *, sum(montant) solde, classe from commande group by client_id where "
                               + " produit_id = " + produit.getId() + "group by client_id order by montant desc;");
            return c.getClient();
        }
}
