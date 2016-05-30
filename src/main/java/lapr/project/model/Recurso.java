/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Gabriel
 */
public class Recurso {
    private String descricao;

    public Recurso(String descricao) {
        if(descricao.isEmpty()){
            throw new IllegalArgumentException("A descrição nao pode ser nula!");
        }
        this.descricao = descricao;
    }

    public Recurso() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "recurso: "+ this.descricao;
    }
    
    
}
