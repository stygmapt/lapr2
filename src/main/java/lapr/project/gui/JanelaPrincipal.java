/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.gui;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Utilizador;
import lapr.project.states.ExposicaoStateCandidaturasAbertas;

/**
 *
 * @author Gabriel
 */
public class JanelaPrincipal extends javax.swing.JFrame {

	private final CentroExposicoes centro;
	private final Utilizador utilizador_logado;

	/**
	 * Creates new form JanelaPrincipal
	 */
	public JanelaPrincipal(CentroExposicoes c, Utilizador u) {
		this.centro = c;
		this.utilizador_logado = u;
		initComponents();
		setVisible(true);
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        UtilizadorMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Forçar Exposiçoes de Completa para Aberta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        UtilizadorMenu.setText("Utilizador");

        jMenuItem1.setText("Alterar Utilizador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        UtilizadorMenu.add(jMenuItem1);

        jMenuItem2.setText("Log Out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        UtilizadorMenu.add(jMenuItem2);

        jMenuBar1.add(UtilizadorMenu);

        editMenu.setText("Organizador");

        jMenuItem3.setText("Definir FAE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem3);

        jMenuItem4.setText("Criar Demonstração");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem4);

        jMenuItem8.setText("Definir Stands");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem8);

        jMenuItem10.setText("Atribuir Candidaturas para Avaliação");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem10);

        jMenuItem7.setText("Listar Submissões Removidas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem7);

        jMenuBar1.add(editMenu);

        jMenu1.setText("Representante/Expositor");

        jMenuItem5.setText("Submeter Candidatura a Exposição");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Remover Candidatura Submetida");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem9.setText("Alterar Candidatura Submetida");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
		LoginGUI l = new LoginGUI(this.centro);
		dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
		JanelaAlterarUtilizador j = new JanelaAlterarUtilizador(this.centro, this.utilizador_logado);
		dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
		JanelaDefinirFAE j = new JanelaDefinirFAE(this.centro, this.utilizador_logado);
		dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
		JanelaCriarDemonstraçãoGUI janela = new JanelaCriarDemonstraçãoGUI(centro, this.utilizador_logado);
		dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JanelaSubmeterCandidatura j = new JanelaSubmeterCandidatura(centro, utilizador_logado);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JanelaRemoverCandidatura j = new JanelaRemoverCandidatura(centro, utilizador_logado);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for(Exposicao e : centro.getRegistoExposicoes().getListaExposições()){
            if(e.isCompleta()){
                e.setState(new ExposicaoStateCandidaturasAbertas(e));
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JanelaListarCandidaturasRemovidas j = new JanelaListarCandidaturasRemovidas(centro, utilizador_logado);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JanelaAlterarCandidatura j = new JanelaAlterarCandidatura(this.centro,this.utilizador_logado);
        dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JanelaDefinirStand js = new JanelaDefinirStand(centro, utilizador_logado);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        AtribuirCandidatura j = new AtribuirCandidatura(centro, utilizador_logado);
        dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu UtilizadorMenu;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
