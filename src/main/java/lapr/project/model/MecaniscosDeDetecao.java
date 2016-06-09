/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface MecaniscosDeDetecao {
    public List<Conflito> detetarConflitos(List<TipoConflito> lstTiConf, List<Candidatura> lstCandida, List<FAE> lstFAE);
}
