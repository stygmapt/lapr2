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
public class RegistoUtilizadores {
    private List<Utilizador> lista;

    public RegistoUtilizadores() {
        lista = new ArrayList<>();
                
    }

    public List<Utilizador> getLista() {
        return lista;
    }
    
    public Utilizador novoUtilizador(){
        return new Utilizador();
    }
    
    public boolean addUtilizador(Utilizador u){
        return this.lista.add(u);
    }
}
