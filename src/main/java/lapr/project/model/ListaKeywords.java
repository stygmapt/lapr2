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
public class ListaKeywords {
    List<Keyword> lst;
    private int nrKeys;
    
    public ListaKeywords() {
        this.lst=new ArrayList<>();
        this.nrKeys=0;
    }
    
    public int getNrPalavrasLista(){
        return this.nrKeys;
    }
    public List<Keyword> getLista(){
        return this.lst;
    }
    
    public Keyword novaKeyWord(){
        return new Keyword();
    }
    
    public void registaKeyWord(Keyword key){
        if(validaKeyWord(key)){
            nrKeys++;
            this.lst.add(key);
        }else{
            throw new IllegalArgumentException("Esta palavra chave já existe na lista.");
        }
    }

    private boolean validaKeyWord(Keyword key) {
        if(nrKeys>=6){
            throw new IllegalArgumentException("Não podem existir mais de 6 palavras chave.");
        }
        for(Keyword k:this.lst){
            if(k.equals(key)){
                return false;
            }
        }
        return true;
    }
}
