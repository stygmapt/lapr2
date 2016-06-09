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
public class Produto {
    private String designacao_produto;

    public Produto() {
    }
    
    public Produto(String designacao) {
        this.designacao_produto=designacao;
    }

    public String getDesignacao_produto() {
        return designacao_produto;
    }


    public void setDesignacao_produto(String designacao_produto) {
        this.designacao_produto = designacao_produto;
    }

    @Override
    public String toString() {
        return "Produto:\tDesignação: "+this.designacao_produto;
    }
    
    public boolean equals(Object outroObjeto){
        if(this == outroObjeto){
            return true;
        }if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false; 
    }
        Produto outroProduto = (Produto) outroObjeto;
        return this.designacao_produto.equalsIgnoreCase(outroProduto.designacao_produto);
    
}
}
