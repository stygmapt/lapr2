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
public class RegistoExposicoes {

    private final List<Exposicao> listaExposições;

    public RegistoExposicoes() {
        listaExposições = new ArrayList<>();
    }

    public Exposicao novaExposição() {
        return new Exposicao();
    }

    public boolean registaExposição(Exposicao e) {
        if (validaExposição(e)) {
            return addExposição(e);
        } else {
            return false;
        }
    }

    public boolean validaExposição(Exposicao e) {
        return e.valida();
    }

    public List<Exposicao> getListaExposições() {
        return this.listaExposições;
    }

//    public List<Exposicao> getListaExposições(FAE fae) {
//        List<Exposicao> list = new ArrayList<>();
//        for (Exposicao e : listaExposições) {
//            for (FAE f : e.getRegistoFAE().getListaFAE()) {
//                if (fae.getUtilizador().getUser().equals(f.getUtilizador().getUser())) {
//                    list.add(e);
//                }
//            }
//        }
//        return list;
//    }

    public boolean addExposição(Exposicao exp) {
        return this.listaExposições.add(exp);
    }
}
