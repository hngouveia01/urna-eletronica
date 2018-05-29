/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCELO
 */
public class MenuUrna extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCandidatos
     */
    public MenuUrna() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNL_MENU = new javax.swing.JPanel();
        LBL_JUSTICA = new javax.swing.JLabel();
        MNB_MENU = new javax.swing.JMenuBar();
        MNU_CAD_CANDIDATOS = new javax.swing.JMenu();
        MNI_DEP_EST = new javax.swing.JMenuItem();
        MNI_DEP_FED = new javax.swing.JMenuItem();
        MNI_SENADOR = new javax.swing.JMenuItem();
        MNI_GOVERNADOR = new javax.swing.JMenuItem();
        MNI_PRESIDENTE = new javax.swing.JMenuItem();
        MNI_CAD_ELEITOR = new javax.swing.JMenuItem();
        MNU_VOTACAO = new javax.swing.JMenu();
        MNI_VOTAR = new javax.swing.JMenuItem();
        MNU_OPCOES = new javax.swing.JMenu();
        MNU_RESULTADOS = new javax.swing.JMenu();
        MNI_RELATORIO_VENCEDORES = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_MENU.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LBL_JUSTICA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urnaeletronica/imagens/Eleições2018.png"))); // NOI18N

        javax.swing.GroupLayout PNL_MENULayout = new javax.swing.GroupLayout(PNL_MENU);
        PNL_MENU.setLayout(PNL_MENULayout);
        PNL_MENULayout.setHorizontalGroup(
            PNL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_MENULayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(LBL_JUSTICA, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        PNL_MENULayout.setVerticalGroup(
            PNL_MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_MENULayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(LBL_JUSTICA, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        MNU_CAD_CANDIDATOS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNU_CAD_CANDIDATOS.setText("CADASTROS");

        MNI_DEP_EST.setText("DEPUTADO ESTADUAL (a)");
        MNI_DEP_EST.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNI_DEP_EST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_DEP_ESTActionPerformed(evt);
            }
        });
        MNU_CAD_CANDIDATOS.add(MNI_DEP_EST);

        MNI_DEP_FED.setText("DEPUTADO FEDERAL (a)");
        MNI_DEP_FED.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNI_DEP_FED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_DEP_FEDActionPerformed(evt);
            }
        });
        MNU_CAD_CANDIDATOS.add(MNI_DEP_FED);

        MNI_SENADOR.setText("SENADOR (a)");
        MNI_SENADOR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNI_SENADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_SENADORActionPerformed(evt);
            }
        });
        MNU_CAD_CANDIDATOS.add(MNI_SENADOR);

        MNI_GOVERNADOR.setText("GOVERNADOR (a)");
        MNI_GOVERNADOR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNI_GOVERNADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_GOVERNADORActionPerformed(evt);
            }
        });
        MNU_CAD_CANDIDATOS.add(MNI_GOVERNADOR);

        MNI_PRESIDENTE.setText("PRESIDENTE (a)");
        MNI_PRESIDENTE.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNI_PRESIDENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_PRESIDENTEActionPerformed(evt);
            }
        });
        MNU_CAD_CANDIDATOS.add(MNI_PRESIDENTE);

        MNI_CAD_ELEITOR.setText("CADASTRAR ELEITOR");
        MNI_CAD_ELEITOR.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNI_CAD_ELEITOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_CAD_ELEITORActionPerformed(evt);
            }
        });
        MNU_CAD_CANDIDATOS.add(MNI_CAD_ELEITOR);

        MNB_MENU.add(MNU_CAD_CANDIDATOS);

        MNU_VOTACAO.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNU_VOTACAO.setText("VOTAÇÃO");

        MNI_VOTAR.setText("INICIAR VOTAÇÃO");
        MNI_VOTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNI_VOTARActionPerformed(evt);
            }
        });
        MNU_VOTACAO.add(MNI_VOTAR);

        MNB_MENU.add(MNU_VOTACAO);

        MNU_OPCOES.setText("OPÇÕES...");

        MNU_RESULTADOS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNU_RESULTADOS.setText("RESULTADOS");

        MNI_RELATORIO_VENCEDORES.setText("CANDIDATOS VENCEDORES");
        MNI_RELATORIO_VENCEDORES.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MNU_RESULTADOS.add(MNI_RELATORIO_VENCEDORES);

        MNU_OPCOES.add(MNU_RESULTADOS);

        jMenuItem1.setText("SAIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MNU_OPCOES.add(jMenuItem1);

        MNB_MENU.add(MNU_OPCOES);

        setJMenuBar(MNB_MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_MENU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNL_MENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "DESEJA ENCERRAR A URNA?", "ATENÇÃO", JOptionPane.YES_OPTION)==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MNI_DEP_FEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_DEP_FEDActionPerformed
        CadastroDeputadoFederal tela = new CadastroDeputadoFederal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_MNI_DEP_FEDActionPerformed

    private void MNI_DEP_ESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_DEP_ESTActionPerformed
        CadastroDeputadoEstadual tela = new CadastroDeputadoEstadual();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_MNI_DEP_ESTActionPerformed

    private void MNI_SENADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_SENADORActionPerformed
        CadastroSenador tela = new CadastroSenador();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_MNI_SENADORActionPerformed

    private void MNI_GOVERNADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_GOVERNADORActionPerformed
        CadastroGovernador tela = new CadastroGovernador();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_MNI_GOVERNADORActionPerformed

    private void MNI_PRESIDENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_PRESIDENTEActionPerformed
        CadastroPresidente tela = new CadastroPresidente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_MNI_PRESIDENTEActionPerformed

    private void MNI_CAD_ELEITORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_CAD_ELEITORActionPerformed
        CadastroEleitor tela = new CadastroEleitor();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_MNI_CAD_ELEITORActionPerformed

    private void MNI_VOTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNI_VOTARActionPerformed
        
    }//GEN-LAST:event_MNI_VOTARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUrna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_JUSTICA;
    private javax.swing.JMenuBar MNB_MENU;
    private javax.swing.JMenuItem MNI_CAD_ELEITOR;
    private javax.swing.JMenuItem MNI_DEP_EST;
    private javax.swing.JMenuItem MNI_DEP_FED;
    private javax.swing.JMenuItem MNI_GOVERNADOR;
    private javax.swing.JMenuItem MNI_PRESIDENTE;
    private javax.swing.JMenuItem MNI_RELATORIO_VENCEDORES;
    private javax.swing.JMenuItem MNI_SENADOR;
    private javax.swing.JMenuItem MNI_VOTAR;
    private javax.swing.JMenu MNU_CAD_CANDIDATOS;
    private javax.swing.JMenu MNU_OPCOES;
    private javax.swing.JMenu MNU_RESULTADOS;
    private javax.swing.JMenu MNU_VOTACAO;
    private javax.swing.JPanel PNL_MENU;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
