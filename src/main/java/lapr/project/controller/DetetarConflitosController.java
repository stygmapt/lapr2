/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Conflito;
import lapr.project.model.Exposicao;
import lapr.project.model.MecanismoDetecao1;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoTiposConflito;
import lapr.project.states.ExposicaoStateConflitosDetetados;

/**
 *
 * @author Gabriel
 */
public class DetetarConflitosController {
    private CentroExposicoes centro;
    private RegistoTiposConflito reg_tiposConflito;
    private Exposicao exposicao;
    

    public DetetarConflitosController(CentroExposicoes centro,Exposicao e) {
        this.centro = centro;
        this.exposicao=e;
        this.reg_tiposConflito=this.centro.getRegTiposConflito();
    }
    
    public void  detetarConflitosPeloMecanismo1(){
        List<Conflito> lst = new MecanismoDetecao1().detetarConflitos(this.centro.getRegTiposConflito().getLista(),
                this.exposicao.getRegistoCandidaturas().getListaCandidaturas(),
                this.exposicao.getListaFae().getLista());
                this.exposicao.setConflitosDetetados(lst);
                this.exposicao.setState(new ExposicaoStateConflitosDetetados(this.exposicao));
     }
    
}
