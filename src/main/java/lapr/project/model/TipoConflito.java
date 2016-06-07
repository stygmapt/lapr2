/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Gabriel
 */
public class TipoConflito {
    private String descricao;

    public TipoConflito() {
    }

    public TipoConflito(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.isEmpty()||descricao==null){
            throw new IllegalArgumentException("A descrição do tipo de conflito nao pode ser nula.");
        }
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tipo de conflito: " + this.descricao; 
    }

    public boolean equals(TipoConflito o) {
        if (this == null) {
			return false;
		}
		if (o != null) {
			return o.getDescricao().equalsIgnoreCase(this.getDescricao());
		}
		return false;
    }
    
    
    
}
