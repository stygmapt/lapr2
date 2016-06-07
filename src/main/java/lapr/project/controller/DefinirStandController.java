
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoStand;
import lapr.project.model.Stand;
import lapr.project.model.Utilizador;

/**
 *
 * @author Tiago
 */
public class DefinirStandController {
    private CentroExposicoes centro;
    private RegistoExposicoes regExpo;
    private Exposicao expoSelected;
    private RegistoStand regStand;
    private Stand stand;

    public DefinirStandController(CentroExposicoes centro) {
        this.centro = centro;
        this.regExpo = this.centro.getRegistoExposicoes();
    }

    public void selectExpo(Exposicao e) {
        this.expoSelected = e;
        this.regStand = e.getRegistoStand();
        this.stand = this.regStand.novoStand();
    
    }
    
    public void setArea(float area){
        this.stand.setArea(area);
    }
    
    
    public List<Exposicao> getExposicaoByOrganizador(Utilizador utilizador){
        return this.regExpo.getListaExposicoesDoOrganizador(utilizador);
    }

    public void confirmaRegisto(){
        this.regStand.adicionarListaStands(stand);
    }
}
