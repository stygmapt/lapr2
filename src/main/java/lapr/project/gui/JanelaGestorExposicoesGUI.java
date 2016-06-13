/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Recurso;
import lapr.project.model.Utilizador;
import lapr.project.utils.XMLParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author Gabriel
 */
public class JanelaGestorExposicoesGUI extends javax.swing.JFrame {

	private final CentroExposicoes centro;

	/**
	 * Creates new form JanelaGestorExposicoesGUI
	 */
	public JanelaGestorExposicoesGUI(CentroExposicoes centro) {
		this.centro = centro;
		initComponents();
		setVisible(true);
		setLocationRelativeTo(null);
	}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        accoesMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        listagensMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Terminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        accoesMenu.setText("Acções");
        accoesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accoesMenuActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Confirmar Utilizador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        accoesMenu.add(jMenuItem3);

        jMenuItem4.setText("Criar Exposição");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        accoesMenu.add(jMenuItem4);

        jMenuItem5.setText("Definir Recurso");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        accoesMenu.add(jMenuItem5);

        jMenuItem6.setText("Definir Tipo de Conflito");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        accoesMenu.add(jMenuItem6);

        jMenuBar1.add(accoesMenu);

        listagensMenu.setText("Listagens");

        jMenuItem1.setText("Listar Utilizadores Não confirmados");
        listagensMenu.add(jMenuItem1);

        jMenuItem2.setText("Listar Utilizadores Registados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        listagensMenu.add(jMenuItem2);

        jMenuItem7.setText("Listar Exposições");
        listagensMenu.add(jMenuItem7);

        jMenuBar1.add(listagensMenu);

        jMenu1.setText("Ficheiro");

        jMenuItem8.setText("Exportaçao");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButton1)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accoesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accoesMenuActionPerformed

    }//GEN-LAST:event_accoesMenuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
		JanelaConfirmarUtilizador janela = new JanelaConfirmarUtilizador(centro);
		dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
		JanelaDefinirRecurso j = new JanelaDefinirRecurso(this.centro);
                dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		LoginGUI j = new LoginGUI(centro);
		dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
		JanelaCriarExposicao j = new JanelaCriarExposicao(this.centro);
		dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
		JanelaCriarTipoConflito j = new JanelaCriarTipoConflito(centro);
		dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
		try {
			Export();
		} catch (Exception ex) {
			Logger.getLogger(JanelaGestorExposicoesGUI.class.getName()).
				log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accoesMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu listagensMenu;
    // End of variables declaration//GEN-END:variables

	private void Export() throws Exception {
		String caminho = "C:\\Users\\Eduardo\\Desktop\\LAPR2\\LAPR2CLONE\\lapr2-2015-2016-g66\\new 1.xml";
		DocumentBuilderFactory factory
			= DocumentBuilderFactory.newInstance();

		//Create document builder
		DocumentBuilder builder = factory.newDocumentBuilder();

		//Obtain a new document
		Document document = builder.newDocument();
		XMLParser xml = new XMLParser();
		Element t = document.createElement("Centro");
		for (Utilizador object : centro.getUtilizadoresRegistados().getLista()) {
			Node nodeUtil = object.exportContentToXMLNode();
			t.appendChild(document.importNode(nodeUtil, true));
		}
		for (Recurso object : centro.getM_regRecursos().getListaRecursos()) {
			Node nodeUtil = object.exportContentToXMLNode();
			t.appendChild(document.importNode(nodeUtil, true));
		}
		for (Exposicao lppexposicao : centro.getRegistoExposicoes().
			getListaExposições()) {
			Node nodeUtil = lppexposicao.exportContentToXMLNode();
			t.appendChild(document.importNode(nodeUtil, true));
		}
		document.appendChild(t);
		Node rootNode = t;
		xml.writeXMLElementToFile(rootNode, caminho);
	}
}
