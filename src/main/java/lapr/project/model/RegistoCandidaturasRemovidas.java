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
public class RegistoCandidaturasRemovidas {
     private final List<Candidatura> listaCandidaturasRemovidas;

    public RegistoCandidaturasRemovidas() {
        listaCandidaturasRemovidas = new ArrayList<>();
    }

    public Candidatura novaCandidaturaRe() {
        return new Candidatura();
    }

    public boolean registaCandidaturaRemovida(Candidatura c) {
        return addCandidaturaRemovida(c);    
    }

    public List<Candidatura> getListaCandidaturas() {
        return this.listaCandidaturasRemovidas;
    }

    private boolean addCandidaturaRemovida(Candidatura c) {
        return this.listaCandidaturasRemovidas.add(c);
    }
    
}
