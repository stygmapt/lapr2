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
public class ListaProdutos {
    private final List<Produto> lista;

    public ListaProdutos() {
        this.lista=new ArrayList<>();
    }
    
    public List<Produto> getLista(){
        return this.lista;
    }
    
}
