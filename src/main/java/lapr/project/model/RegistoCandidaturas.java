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
public class RegistoCandidaturas {
    private final List<Candidatura> listaCandidaturas;

    public RegistoCandidaturas() {
        listaCandidaturas = new ArrayList<>();
    }

    public Candidatura novaCandidatura() {
        return new Candidatura();
    }

    public boolean registaCandidatura(Candidatura c) {
        if (validaCandidatura(c)) {
            return addCandidatura(c);
        } else {
            return false;
        }
    }

    public boolean validaCandidatura(Candidatura c) {
        return c.valida();
    }

    public List<Candidatura> getListaCandidaturas() {
        return this.listaCandidaturas;
    }

    private boolean addCandidatura(Candidatura c) {
        return this.listaCandidaturas.add(c);
    }
}
