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
public class ListaOrganizadores {
    private final List<Organizador> lista;

    public ListaOrganizadores() {
        this.lista=new ArrayList<>();
    }
    
    public void addOrganizador(Utilizador u){
        Organizador newOrga = new Organizador();
        newOrga.setUtilizador(u);
         if(validaOrganizador(newOrga)){
             this.lista.add(newOrga);
         }else{
             throw new IllegalArgumentException("Esse utilizador já está definido como organizador.");
         }
    }

    private boolean validaOrganizador(Organizador o) {
        for(Organizador orga:this.lista){
            if(orga.getUtilizador().equals(o.getUtilizador())){
                return false;
            }
        }
        return true;
    }
}
