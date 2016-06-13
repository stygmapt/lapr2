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
public class RegistoAtribuicoes{

	private List<Atribuicao> m_listaAtribuicao;

	public RegistoAtribuicoes() {
		m_listaAtribuicao = new ArrayList<>();
	}

	public boolean adicionarAtribuicao(Atribuicao atribuicao) {
		return m_listaAtribuicao.add(atribuicao);
	}

	public List<Atribuicao> getListaAtribuicao() {
		return m_listaAtribuicao;
	}

	public void registaAtribuicao(List<Atribuicao> lista) {
		this.m_listaAtribuicao = lista;
	}

    public List<Atribuicao> getAtribuicoesPorAvaliarByFAE(Utilizador u) {
        List<Atribuicao> lst=new ArrayList<>();
        for(Atribuicao atr:this.m_listaAtribuicao){
            if(atr.isAlreadyAvaliada()==false){
                if(u.equals(atr.getFAE().getUtilizador())){
                    lst.add(atr);
                }
            }
        }
        return lst;
    }
}
