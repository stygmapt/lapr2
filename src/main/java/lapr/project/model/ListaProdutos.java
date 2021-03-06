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
    private Produto p;
    public ListaProdutos() {
        this.lista=new ArrayList<>();
    }
    
    public List<Produto> getLista(){
        return this.lista;
    }

    public Produto novoProduto() {
        this.p = new Produto();
        return p;
    }

    public void adicionaProduto(Produto produto) {
        for(Produto p:this.lista){
            if(p.equals(produto)){
                throw new IllegalArgumentException("Já existe um produto com essa designaçao.");
            }
        }
        this.lista.add(produto);
    } 
}
