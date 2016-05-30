/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Tiago
 */
public class Conflito {

    private FAE fae;
    
    

    public Conflito() {

    }

//    public Candidatura getCandidatura() {
//        return this.can;
//    }

    public boolean valida() {
        System.out.println("Conflito: valida: " + this.toString());
        return true;
    }

}
