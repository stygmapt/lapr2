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
public class RegistoConflito {
    List<Conflito> lista;

    public RegistoConflito() {
        this.lista=new ArrayList<>();
    }
    
    public void setListaConflitos(List<Conflito> l){
        this.lista=l;
    }
    
}
