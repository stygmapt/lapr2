/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class CentroExposicoes implements Serializable{

	private final List<Utilizador> m_lUtilizadoresNConfirmados;
	private final RegistoUtilizadores m_regUtilizadores;
        private final RegistoRecursos m_regRecursos;
        private final RegistoExposicoes m_regExposicoes;
        

	public CentroExposicoes() {
		this.m_lUtilizadoresNConfirmados = new ArrayList<>();
		this.m_regUtilizadores = new RegistoUtilizadores();
                this.m_regRecursos= new RegistoRecursos();
                this.m_regExposicoes = new RegistoExposicoes();
	}

	public boolean registaUtilizador(Utilizador u) {
		if (validaUtilizador(u)) {
			m_lUtilizadoresNConfirmados.add(u);
			return true;
		}
		return false;
	}

        public RegistoRecursos getM_regRecursos() {
            return m_regRecursos;
        }

    public RegistoExposicoes getRegistoExposicoes() {
        return m_regExposicoes;
    }
        
        
        public boolean adicionaRecurso(String dscRecurso){
            if(this.m_regRecursos.registaRecurso(dscRecurso)){
                return true;
            }else{
                return false;
            }
        }
        
	private boolean validaUtilizador(Utilizador u) {
            for(Utilizador ut:this.getUtilizadoresRegistados().getLista()){
                if(ut.equals(u)){
                    throw new IllegalArgumentException("já existe esse utilizador no sistema.");
            
                }
            }
            for(Utilizador ut:this.m_lUtilizadoresNConfirmados){
                if(ut.equals(u)){
                    throw new IllegalArgumentException("já existe esse utilizador no sistema.");
            
                }
            }
		
            return true;
        }

	public RegistoUtilizadores getUtilizadoresRegistados() {
		return this.m_regUtilizadores;
	}

	public List<Utilizador> getUtilizadoresNaoConfirmados() {
		return this.m_lUtilizadoresNConfirmados;
	}

	public Utilizador getUtilizadorByUsername(String uId) {
		for (Utilizador u : m_regUtilizadores.getLista()) {
			if (uId.equalsIgnoreCase(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
        
        public Utilizador getUtilizadorByUsernameListNConf(String uId) {
		for (Utilizador u : m_lUtilizadoresNConfirmados) {
			if (uId.equalsIgnoreCase(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
        
	public void confirmaRegistoUtilizador(Utilizador u) {
		this.m_regUtilizadores.addUtilizador(u);
		this.m_lUtilizadoresNConfirmados.remove(u);
	}

}
