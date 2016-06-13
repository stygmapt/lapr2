/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Tiago
 */
public class Stand implements Serializable{
    
    private int id;
    
    private float area;
    
    public Stand(int id, float area){
        this.id = id;
        this.area = area;
    }
   
    public Stand(){
       
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public float getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Area: " + area;
    }
    
    public boolean equals(Object outroObjeto){
        if(this == outroObjeto){
            return true;
        }if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false; 
    }
        Stand outroStand = (Stand) outroObjeto;
        return this.id == outroStand.id;
    
}
    
}
