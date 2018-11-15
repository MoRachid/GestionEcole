/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bean.Bureau;
import service.BureauService;
import service.ProfesseurService;

/**
 *
 * @author UPMuser
 */
public class Test {
    public static void main(String[] args) {
        
        ProfesseurService ps = new ProfesseurService();
        
        BureauService bs = new BureauService();
        Bureau b =  new Bureau(1, "Info");
        bs.creer(b);
        ps.creer(b);
    }
}
