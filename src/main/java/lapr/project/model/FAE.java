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
public class FAE {

    private Utilizador utilizador;
    private RegistoConflitos registo;

    public FAE() {
        registo = new RegistoConflitos();
    }

    public RegistoConflitos getRegistoConflitos() {
        return this.registo;
    }

    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    public void setUtilizador(Utilizador u) {
        this.utilizador = u;
    }

    public boolean equals(FAE o) {
        if (this == null) {
			return false;
		}
		if (o != null) {
			return o.getUtilizador().equals(this.getUtilizador());
		}
		return false;
    }

    
    public String toString() {
        String str = "FAE:";
        str += "\tUser: " + this.utilizador.getUsername();

        return str;
    }
}
