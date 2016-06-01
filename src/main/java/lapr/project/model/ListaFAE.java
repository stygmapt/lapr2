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
public class ListaFAE {
    private final List<FAE> lista;

    public ListaFAE() {
        this.lista=new ArrayList<>();
    }
    
    public List<FAE> getLista(){
        return this.lista;
    }
    public void addFAE(Utilizador u){
        FAE newFAE = new FAE();
        newFAE.setUtilizador(u);
         if(validaFAE(newFAE)){
             this.lista.add(newFAE);
         }else{
             throw new IllegalArgumentException("Esse utilizador já está definido como FAE.");
         }
    }

    private boolean validaFAE(FAE o) {
        for(FAE f:this.lista){
            if(f.getUtilizador().equals(o.getUtilizador())){
                return false;
            }
        }
        return true;
    }
}
