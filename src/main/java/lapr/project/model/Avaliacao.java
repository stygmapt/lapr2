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
public class Avaliacao {
    private int conhecimento_FAE;
    private int adq_expos;
    private int adq_demon;
    private int adq_nr_convites;
    private int recomendacao;

    public Avaliacao(int conhecimento_FAE, int adq_expos, int adq_demon, int adq_nr_convites, int recomendacao) {
        if(conhecimento_FAE<0||conhecimento_FAE>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        if(adq_expos<0||adq_expos>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        if(adq_demon<0||adq_demon>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        if(adq_nr_convites<0||adq_nr_convites>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        if(recomendacao<0||recomendacao>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        this.conhecimento_FAE = conhecimento_FAE;
        this.adq_expos = adq_expos;
        this.adq_demon = adq_demon;
        this.adq_nr_convites = adq_nr_convites;
        this.recomendacao = recomendacao;
    }

    public Avaliacao() {
    }

    public int getConhecimento_FAE() {
        return conhecimento_FAE;
    }

    public void setConhecimento_FAE(int conhecimento_FAE) {
        if(conhecimento_FAE<0||conhecimento_FAE>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        this.conhecimento_FAE = conhecimento_FAE;
    }

    public int getAdq_expos() {
        return adq_expos;
    }

    public void setAdq_expos(int adq_expos) {
        if(adq_expos<0||adq_expos>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        this.adq_expos = adq_expos;
    }

    public int getAdq_demon() {
        return adq_demon;
    }

    public void setAdq_demon(int adq_demon) {
        if(adq_demon<0||adq_demon>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        this.adq_demon = adq_demon;
    }

    public int getAdq_nr_convites() {
        return adq_nr_convites;
    }

    public void setAdq_nr_convites(int adq_nr_convites) {
        if(adq_nr_convites<0||adq_nr_convites>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        this.adq_nr_convites = adq_nr_convites;
    }

    public int getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(int recomendacao) {
        if(recomendacao<0||recomendacao>5){
            throw  new IllegalArgumentException("tem de ser um valor de 0 a 5.");
        }
        this.recomendacao = recomendacao;
    }

    @Override
    public String toString() {
        return "Avaliação: conhecimento Fae: "+this.conhecimento_FAE+
                " adq exposicao: "+this.adq_expos+
                " adq demonstracao: "+this.adq_demon+
                " adq nr convites: "+this.adq_nr_convites+
                " recomendacao: "+this.recomendacao;
    }
    
    
    
    
}
