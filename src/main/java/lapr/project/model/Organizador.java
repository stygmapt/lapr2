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
public class Organizador {

    private Utilizador utilizador;

    public Organizador() {

    }

    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    public void setUtilizador(Utilizador u) {
        this.utilizador = u;
    }

    public String toString() {
        String str = "Organizador:\n";
        str += "\tUser: " + this.utilizador.getUsername() + "\n";

        return str;
    }

}
