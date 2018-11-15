/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Bureau;
import bean.Professeur;
import dao.AbstractFacade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProfesseurService extends AbstractFacade<Professeur>{

    public ProfesseurService() {
        super(Professeur.class);
    }
    
    public void creer(Bureau bureau){
        Professeur professeur = new Professeur(58000, "PA", 2, bureau);
        create(professeur);
    }
    
    public Professeur find(String idProf,List<Professeur> profs){
        for(Professeur prof : profs){
            if(prof.getId().equals(idProf)){
                return prof;
            }
        }
        return null;
    }
    public  Professeur findAncienProf(List<Professeur> profs) {
        for(Professeur prof : profs){
            return prof;
        }
        return null;
    }

    public  List<Professeur> findProfByGrade(List<Professeur> profs,String grade){
        List<Professeur> professeurTrouve = new ArrayList<>();
        Professeur professeur = null;
        for (int i = 0; i < profs.size(); i++) {
            professeur = profs.get(i);
            if (professeur.getGrade()== grade) {
                professeurTrouve.add(professeur);
            }
        }
        return professeurTrouve;
    }
    
    public List<Professeur> findProfByDepartement(String departement,List<Professeur> profs){
        List<Professeur> profTrouve = new ArrayList<>();
        Professeur professeur = null;
        for(int i = 0; i < profs.size(); i++){
            professeur = profs.get(i);
            if(professeur.getBureau().getDepartement() == departement){
                profTrouve.add(professeur);
            }
        }
        return profTrouve;
    }
    
    
}
