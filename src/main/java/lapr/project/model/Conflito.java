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
    private Candidatura candidatura;
    private TipoConflito tipoConflito;

    public Conflito(FAE fae, Candidatura candidatura, TipoConflito tipoConflito) {
        this.fae = fae;
        this.candidatura = candidatura;
        this.tipoConflito = tipoConflito;
    }
    
    public Conflito() {

    }

    public FAE getFae() {
        return fae;
    }

    public void setFae(FAE fae) {
        this.fae = fae;
    }

    public Candidatura getCandidatura() {
        return candidatura;
    }

    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    public TipoConflito getTipoConflito() {
        return tipoConflito;
    }

    public void setTipoConflito(TipoConflito tipoConflito) {
        this.tipoConflito = tipoConflito;
    }

    public boolean equals(Conflito u) {
		if (this == null) {
			return false;
		}
		if (u != null) {
			return u.getCandidatura().equals(this.candidatura)&&
                                u.getFae().equals(this.getFae())&&
                                u.getTipoConflito().equals(this.getTipoConflito());
		}
		return false;
	}

    boolean valida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
