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
public class CentroExposicoes {
     private final List<Utilizador> m_lUtilizadoresNConfirmados;
     private final RegistoUtilizadores m_regUtilizadores;

    public CentroExposicoes() {
        this.m_lUtilizadoresNConfirmados = new ArrayList<>();
        this.m_regUtilizadores = new RegistoUtilizadores();
    }
     
     
}
