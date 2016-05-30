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
public class RegistoRecursos {
    private List<Recurso> lista;

    public RegistoRecursos() {
        lista = new ArrayList<>();
    }
    
    public boolean registaRecurso(String dsc){
        Recurso r = new Recurso(dsc);
        if(validaRecurso(r)){
            lista.add(r);
            return true;
        }else{
            throw new IllegalArgumentException("já existe um recurso com essa descrição");
        }
    }

    private boolean validaRecurso(Recurso r) {
        return !this.lista.contains(r);
    }

}
