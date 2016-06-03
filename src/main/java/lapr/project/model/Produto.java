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
    private List<String> palavras_chave_produto;

    public Produto() {
        this.palavras_chave_produto=new ArrayList<>();
    }
    
    public Produto(String designacao) {
        this.designacao_produto=designacao;
        this.palavras_chave_produto=new ArrayList<>();
    }

    public String getDesignacao_produto() {
        return designacao_produto;
    }

    public List<String> getPalavras_chave_produto() {
        return palavras_chave_produto;
    }

    public void setDesignacao_produto(String designacao_produto) {
        this.designacao_produto = designacao_produto;
    }

    public void setPalavras_chave_produto(List<String> palavras_chave_produto) {
        this.palavras_chave_produto = palavras_chave_produto;
    }

    @Override
    public String toString() {
        return "Produto:\tDesignação: "+this.designacao_produto;
    }
    
    
    
    
}
