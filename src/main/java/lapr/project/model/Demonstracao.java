/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Eduardo
 */
public class Demonstracao {

	private static int codigo;
	private String descricao;
	private ListaRecurso listaRecurso;

	public Demonstracao() {
		this.listaRecurso = new ListaRecurso();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo() {
		codigo++;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws IllegalArgumentException {
		if (descricao.isEmpty()) {
			throw new IllegalArgumentException("A descricacao da Demonstracao esta vazia");
		}
		this.descricao = descricao;
	}

	public ListaRecurso getListaRecurso() {
		return listaRecurso;
	}

    public boolean equals(Demonstracao o) {
    if (this == null) {
			return false;
		}
		if (o != null) {
			return o.getCodigo()==this.getCodigo()&&
                                o.getDescricao().equalsIgnoreCase(this.getDescricao());
		}
		return false;
    }

        
	public boolean valida() {
		return !this.listaRecurso.getListaRecursos().isEmpty();
	}

}
