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
public class RegistoConflitos {

    private final List<Conflito> listaConflitos;

    public RegistoConflitos() {
        listaConflitos = new ArrayList<>();
    }

    public Conflito novaConflito() {
        return new Conflito();
    }

    public boolean registaConflito(Conflito c) {
        if (validaConflito(c)) {
            return addConflito(c);
        } else {
            return false;
        }
    }

    public boolean validaConflito(Conflito c) {
        return c.valida();
    }

    public List<Conflito> getListaConflitos() {
        return this.listaConflitos;
    }

    public boolean addConflito(Conflito c) {
        return this.listaConflitos.add(c);
    }

}
