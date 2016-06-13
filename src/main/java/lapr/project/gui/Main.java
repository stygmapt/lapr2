package lapr.project.gui;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.MecanismoDeAtribuicao1;
import lapr.project.model.MecanismoDeAtribuicao2;
import lapr.project.model.Utilizador;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

	/**
	 * Private constructor to hide implicit public one.
	 */
	private Main() {

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

//		CalculatorExample calculatorExample = new CalculatorExample();
//		System.out.println(calculatorExample.sum(3, 5));
		CentroExposicoes centro = new CentroExposicoes();
		Utilizador u1 = new Utilizador("choura", "choura", "choura@isep.ipp.pt", "meteorito");
		Utilizador u2 = new Utilizador("choura2", "choura2", "chour2a@isep.ipp.pt", "meteorito");
		Utilizador u3 = new Utilizador("choura3", "choura3", "cho3ura@isep.ipp.pt", "meteorito");
		Utilizador u4 = new Utilizador("choura4", "choura4", "choura4@isep.ipp.pt", "meteorito");

		centro.registaUtilizador(u1);
		centro.registaUtilizador(u2);
		centro.registaUtilizador(u3);
		centro.registaUtilizador(u4);
		centro.confirmaRegistoUtilizador(u1);
		centro.confirmaRegistoUtilizador(u2);
		centro.confirmaRegistoUtilizador(u3);
		centro.confirmaRegistoUtilizador(u4);
		MecanismoDeAtribuicao1 meca = new MecanismoDeAtribuicao1();
		MecanismoDeAtribuicao2 meca1 = new MecanismoDeAtribuicao2();
		centro.getM_regMecanismos().adicionarMecanismo(meca);
		centro.getM_regMecanismos().adicionarMecanismo(meca1);
		LoginGUI j = new LoginGUI(centro);
	}

}
