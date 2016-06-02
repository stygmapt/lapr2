/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.Recurso;
import lapr.project.model.Utilizador;
import lapr.project.states.ExposicaoStateCompleto;
import lapr.project.states.ExposicaoStateDemonstracaoSemFAE;

/**
 *
 * @author Eduardo
 */
public class CriarDemonstracaoController {

	private Demonstracao m_demonstraçao;
	private CentroExposicoes m_centro;
	private Exposicao m_exposicao;

	public CriarDemonstracaoController(CentroExposicoes centro) {
		this.m_centro = centro;
	}

	public List<Exposicao> getListaExposicoesDoOrganizador(Utilizador user) {
		return this.m_centro.getRegistoExposicoes().
			getListaExposicoesDoOrganizador(user);
	}

	public Demonstracao novaDemonstracao(Exposicao expo) {
		this.m_exposicao = expo;
		this.m_demonstraçao = m_exposicao.getListaDemonstracao().
			novaDemonstracao();
		return this.m_demonstraçao;
	}

	public void setDados(String descricao) throws IllegalArgumentException {
		this.m_demonstraçao.setCodigo();
		this.m_demonstraçao.setDescricao(descricao);
	}

	public List<Recurso> getListaRecursos() {
		return this.m_centro.getM_regRecursos().getListaRecursos();
	}

	public void AdicionaRecurso(Recurso recurso) {
		m_demonstraçao.getListaRecurso().adicionaRecurso(recurso);
	}

        public List<Recurso> getRecursosSelecionados(){
            return this.m_demonstraçao.getListaRecurso().getListaRecursos();
        }
	public Boolean RegistaDemonstracao(Demonstracao demonstraçao) {
		this.m_demonstraçao = demonstraçao;
		if (this.m_demonstraçao.valida()) {
			this.m_exposicao.getListaDemonstracao().
				adicionarDemonstracao(demonstraçao);
                        for(Recurso r:this.m_centro.getM_regRecursos().getListaRecursos()){
                            System.out.println(r.toString());
                        }
			return true;
		} else {
			return false;
		}
	}

	public void ChangeState() {
		if (m_exposicao.vereficaEstado()) {
			m_exposicao.setState(new ExposicaoStateCompleto(m_exposicao));
		} else {
			m_exposicao.
				setState(new ExposicaoStateDemonstracaoSemFAE(m_exposicao));
		}
	}
}
