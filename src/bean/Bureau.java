/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author outah
 */
public class Bureau {

    private int id;
    private int etage;
    private String departement;

    static int cmpB = 0;

    public Bureau() {
    }

    public Bureau(int etage, String departement) {
        this.id = generatedId();
        this.etage = etage;
        this.departement = departement;
    }

    public int generatedId() {
        cmpB += 2;
        return cmpB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Bureau{" + "id=" + id + ", etage=" + etage + ", departement=" + departement + '}';
    }

}
