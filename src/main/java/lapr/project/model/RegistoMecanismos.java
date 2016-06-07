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
 * @author Eduardo
 */
public class RegistoMecanismos {

	private List<MecanismoDeAtribuicao> listMec;

	public RegistoMecanismos() {
		listMec = new ArrayList<>();
	}

	public List<MecanismoDeAtribuicao> getListaMecanismo() {
		return this.listMec;
	}

	public boolean adicionarMecanismo(MecanismoDeAtribuicao mecanismo) {
		return listMec.add(mecanismo);
	}
}
