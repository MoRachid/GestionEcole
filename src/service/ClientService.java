/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Produit;
import dao.AbstractFacade;

/**
 *
 * @author UPMuser
 */
public class ClientService extends AbstractFacade<Client>{
    
    public ClientService() {
        super(Client.class);
    }
    
    
    public Client creer(Client c){
        create(c);
        return c;
    }
    
    
}
