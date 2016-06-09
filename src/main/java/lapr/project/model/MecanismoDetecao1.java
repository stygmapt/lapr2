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
 * @author Gabriel
 */
public class MecanismoDetecao1 implements MecaniscosDeDetecao{

    public MecanismoDetecao1() {
    }
    

    @Override
    public List<Conflito> detetarConflitos(List<TipoConflito> lstTiConf, List<Candidatura> lstCandida, List<FAE> lstFAE) {
        List<Conflito> lista = new ArrayList<>();
            for(Candidatura can:lstCandida){
                for(FAE fae:lstFAE){
                    if(fae.getUtilizador().equals(can.getRepresentante())){
                        lista.add(new Conflito(fae, can, new TipoConflito("Conflito entre representante da candidatura e um funcionário.")));
                    }
                    
                }
            }
        return lista;
    }
    
}
