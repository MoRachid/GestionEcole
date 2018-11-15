/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
import dao.AbstractFacade;
import java.util.List;

/**
 *
 * @author UPMuser
 */
public class ProduitsService extends AbstractFacade<Produit> {

    private List<Produit> list;
    
    public ProduitsService() {
        super(Produit.class);
        
    }
    
    public Produit creer (Produit p){
        create(p);
        return p;
    }
    
    
    
    
    
    Boolean CheckExistance(Produit p){
        list = findAll();
        if(list.contains(p))
            return true;
        else
        return false;
    }
    
    Boolean ajouterProduit(Produit produit ){
        create(produit);
        return true;
    }
    
    
    
}
