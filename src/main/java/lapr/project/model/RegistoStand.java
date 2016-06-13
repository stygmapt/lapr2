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
 * @author Tiago
 */
public class RegistoStand {

    private List<Stand> lstStands;
    

    public RegistoStand() {
        lstStands = new ArrayList<>();
    }

    public Stand novoStand() {
        return new Stand();
    }

    public List<Stand> getLstStands() {
        return lstStands;
    }

    public void setLstStands(List<Stand> lstStands) {
        this.lstStands = lstStands;
    }


    public void adicionarListaStands(Stand stand) {
        this.lstStands.add(stand);
    }
    
    

}
