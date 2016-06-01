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
public class ListaDemonstracao {

	private List<Demonstracao> listaDemonstracao;

	public ListaDemonstracao() {
		this.listaDemonstracao = new ArrayList<>();
	}

	public List<Demonstracao> getListaDemonstracao() {
		return listaDemonstracao;
	}

	public void adicionarDemonstracao(Demonstracao demonstracao) {
		this.listaDemonstracao.add(demonstracao);
	}

	public Demonstracao novaDemonstracao() {
		return new Demonstracao();
	}

}
