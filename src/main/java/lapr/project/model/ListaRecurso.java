/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class ListaRecurso {

	private List<Recurso> listaRecursos;

	public ListaRecurso() {
		this.listaRecursos = new ArrayList<>();
	}

	public List<Recurso> getListaRecursos() {
		return listaRecursos;
	}

	public void adicionaRecurso(Recurso recurso) {
            for(Recurso r:this.listaRecursos){
                if(r.equals(recurso)){
                    throw new IllegalArgumentException("Já existe o recurso selecionado.");
                }
            }
		this.listaRecursos.add(recurso);
	}

}
