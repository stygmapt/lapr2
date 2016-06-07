/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import com.sun.org.apache.xml.internal.security.encryption.Serializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class RegistoTiposConflito implements Serializable{
    private List<TipoConflito> lst;

    public RegistoTiposConflito() {
        this.lst=new ArrayList<>();
    }
    
    public TipoConflito novoTipoConflito(){
        return new TipoConflito();
    }
    
    public void registaTipoConflito(TipoConflito c){
        for(TipoConflito x:this.lst){
            if(x.equals(c)){
                throw new IllegalArgumentException("Já existe esse tipo de conflito.");
            }
        }
        this.lst.add(c);
    }
}
