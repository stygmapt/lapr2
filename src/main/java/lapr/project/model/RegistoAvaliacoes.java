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
public class RegistoAvaliacoes {
    private List<Avaliacao> lista;

    public RegistoAvaliacoes() {
        this.lista=new ArrayList<>();
    }
    
    public Avaliacao novaAvaliacao(){
        return new Avaliacao();
    }
    
    public void registaAvaliacao(Avaliacao avalia){
        this.lista.add(avalia);
    }
}
