/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARCELO
 */
public class CadastroGovernador extends javax.swing.JFrame {

    int numero = 0;
    String nome = "";
    String partido = "";
    String urlFoto = "";
    String vice = "";
    String urlFotoVice = "";

    public void fotoCandidato(String foto) {
        File img = new File(foto);
        ImageIcon candidato = new ImageIcon(img.getPath());
        LBL_FOTO.setIcon(candidato);

    }
    
    public CadastroGovernador() {
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

        PNL_TELA = new javax.swing.JPanel();
        LBL_NUMERO = new javax.swing.JLabel();
        LBL_NOME = new javax.swing.JLabel();
        TXT_NUMERO = new javax.swing.JTextField();
        TXT_NOME = new javax.swing.JTextField();
        LBL_PARTIDO = new javax.swing.JLabel();
        TXT_PARTIDO = new javax.swing.JTextField();
        LBL_URL_FOTO = new javax.swing.JLabel();
        TXT_URL_FOTO = new javax.swing.JTextField();
        LBL_FOTO = new javax.swing.JLabel();
        BTN_BUSCAR = new javax.swing.JButton();
        BTN_EXCLUIR = new javax.swing.JButton();
        LBL_BRASAO = new javax.swing.JLabel();
        BTN_INSERIR = new javax.swing.JButton();
        BTN_EDITAR = new javax.swing.JButton();
        BTN_LISTAR = new javax.swing.JButton();
        BTN_LIMPAR = new javax.swing.JButton();
        SCP_GOV_PRE = new javax.swing.JScrollPane();
        TBL_GOV_PRE = new javax.swing.JTable();
        LBL_VICE = new javax.swing.JLabel();
        TXT_VICE = new javax.swing.JTextField();
        LBL_URL_FOTO_VICE = new javax.swing.JLabel();
        TXT_URL_FOTO_VICE = new javax.swing.JTextField();
        BTN_VOLTAR_MENU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNL_TELA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO: GOVERNADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        LBL_NUMERO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_NUMERO.setText("NÚMERO:");

        LBL_NOME.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_NOME.setText("NOME:");

        LBL_PARTIDO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_PARTIDO.setText("PARTIDO:");

        LBL_URL_FOTO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_URL_FOTO.setText("URL FOTO:");

        LBL_FOTO.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LBL_FOTO.setMaximumSize(new java.awt.Dimension(110, 110));
        LBL_FOTO.setMinimumSize(new java.awt.Dimension(110, 110));

        BTN_BUSCAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_BUSCAR.setText("BUSCAR CANDIDATO");
        BTN_BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCARActionPerformed(evt);
            }
        });

        BTN_EXCLUIR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_EXCLUIR.setText("EXCLUIR");
        BTN_EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EXCLUIRActionPerformed(evt);
            }
        });

        LBL_BRASAO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urnaeletronica/imagens/BrasaoJusticaEleitoral.png"))); // NOI18N
        LBL_BRASAO.setMaximumSize(new java.awt.Dimension(79, 74));
        LBL_BRASAO.setMinimumSize(new java.awt.Dimension(79, 74));
        LBL_BRASAO.setPreferredSize(new java.awt.Dimension(79, 74));

        BTN_INSERIR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_INSERIR.setText("INSERIR");
        BTN_INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_INSERIRActionPerformed(evt);
            }
        });

        BTN_EDITAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_EDITAR.setText("EDITAR");
        BTN_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EDITARActionPerformed(evt);
            }
        });

        BTN_LISTAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_LISTAR.setText("LISTAR/ATUALIZAR");
        BTN_LISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LISTARActionPerformed(evt);
            }
        });

        BTN_LIMPAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_LIMPAR.setText("LIMPAR");
        BTN_LIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LIMPARActionPerformed(evt);
            }
        });

        TBL_GOV_PRE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÚMERO", "CANDIDATO", "VICE", "PARTIDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        SCP_GOV_PRE.setViewportView(TBL_GOV_PRE);

        LBL_VICE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_VICE.setText("VICE:");

        LBL_URL_FOTO_VICE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_URL_FOTO_VICE.setText("URL FOTO VICE:");

        javax.swing.GroupLayout PNL_TELALayout = new javax.swing.GroupLayout(PNL_TELA);
        PNL_TELA.setLayout(PNL_TELALayout);
        PNL_TELALayout.setHorizontalGroup(
            PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_TELALayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(SCP_GOV_PRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_LISTAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PNL_TELALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PNL_TELALayout.createSequentialGroup()
                        .addComponent(BTN_INSERIR)
                        .addGap(56, 56, 56)
                        .addComponent(BTN_EDITAR)
                        .addGap(56, 56, 56)
                        .addComponent(BTN_LIMPAR))
                    .addGroup(PNL_TELALayout.createSequentialGroup()
                        .addComponent(LBL_BRASAO, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBL_URL_FOTO)
                            .addComponent(LBL_PARTIDO)
                            .addComponent(LBL_NOME)
                            .addComponent(LBL_NUMERO)
                            .addComponent(LBL_VICE)
                            .addComponent(LBL_URL_FOTO_VICE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_URL_FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_PARTIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PNL_TELALayout.createSequentialGroup()
                                .addComponent(TXT_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_BUSCAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_EXCLUIR))
                            .addComponent(TXT_VICE, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_URL_FOTO_VICE, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBL_FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        PNL_TELALayout.setVerticalGroup(
            PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNL_TELALayout.createSequentialGroup()
                .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNL_TELALayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_BRASAO, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNL_TELALayout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_NUMERO)
                            .addComponent(TXT_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_BUSCAR)
                            .addComponent(BTN_EXCLUIR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_NOME)
                            .addComponent(TXT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_PARTIDO)
                            .addComponent(TXT_PARTIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_URL_FOTO)
                            .addComponent(TXT_URL_FOTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_VICE)
                            .addComponent(TXT_VICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_URL_FOTO_VICE)
                            .addComponent(TXT_URL_FOTO_VICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_INSERIR)
                    .addComponent(BTN_EDITAR)
                    .addComponent(BTN_LIMPAR))
                .addGap(41, 41, 41)
                .addGroup(PNL_TELALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SCP_GOV_PRE, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_LISTAR))
                .addGap(24, 24, 24))
        );

        BTN_VOLTAR_MENU.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_VOLTAR_MENU.setText("VOLTAR AO MENU");
        BTN_VOLTAR_MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VOLTAR_MENUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(PNL_TELA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTN_VOLTAR_MENU))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BTN_VOLTAR_MENU)
                .addGap(10, 10, 10)
                .addComponent(PNL_TELA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCARActionPerformed
        TXT_NOME.setText(null);
        TXT_PARTIDO.setText(null);
        TXT_URL_FOTO.setText(null);
        TXT_VICE.setText(null);
        TXT_URL_FOTO_VICE.setText(null);
        LBL_FOTO.setIcon(null);

        int numero = Integer.parseInt(TXT_NUMERO.getText());

        String sql = "select * from governador where GOV_NUMERO = ?";

        String url = "jdbc:mysql://127.0.0.1:3306/eleicao";
        String user = "root";
        String senha = "shieldcorrupted";

        try{
            Connection conexao = DriverManager.getConnection(url, user, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, numero);
            ResultSet busca = comando.executeQuery();

            if(busca.next()==true){
                nome = busca.getString("GOV_NOME");
                partido = busca.getString("GOV_SIGPARTIDO");
                urlFoto = busca.getString("GOV_FOTO");
                vice = busca.getString("GOV_VICE");
                urlFotoVice = busca.getString("GOV_FOTO_VICE");

                TXT_NOME.setText(nome);
                TXT_PARTIDO.setText(partido);
                TXT_URL_FOTO.setText(urlFoto);
                TXT_VICE.setText(vice);
                TXT_URL_FOTO_VICE.setText(urlFotoVice);
                fotoCandidato(urlFoto);
            }else{
                JOptionPane.showMessageDialog(null, "CANDIDATO NÃO ENCONTRADO!"
                    + "\nVerifique se o NÚMERO do CANDIDATO está CORRETO e busque novamente!");
                TXT_NUMERO.setText(null);
            }
            comando.close();
            conexao.close();

        }catch(SQLException erro){
            erro.printStackTrace();
        }
    }//GEN-LAST:event_BTN_BUSCARActionPerformed

    private void BTN_EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EXCLUIRActionPerformed
        numero = Integer.parseInt(TXT_NUMERO.getText());

        String sql = "delete from governador where GOV_NUMERO = ?";

        String url = "jdbc:mysql://127.0.0.1:3306/eleicao";
        String user = "root";
        String senha = "shieldcorrupted";

        try{
            Connection conexao = DriverManager.getConnection(url, user, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, numero);
            comando.executeUpdate();

            comando.close();
            conexao.close();

            JOptionPane.showMessageDialog(null, "CANDIDATO EXCLUÍDO!");

            TXT_NUMERO.setText(null);
            TXT_NOME.setText(null);
            TXT_PARTIDO.setText(null);
            TXT_URL_FOTO.setText(null);
            TXT_VICE.setText(null);
            TXT_URL_FOTO_VICE.setText(null);
            LBL_FOTO.setIcon(null);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL EXCLUIR O CANDIDATO OU NÃO ESTÁ CADASTRADO!"
                + "\nTENTE NOVAMENTE!");
            erro.printStackTrace();
        }
    }//GEN-LAST:event_BTN_EXCLUIRActionPerformed

    private void BTN_INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_INSERIRActionPerformed
        numero = Integer.parseInt(TXT_NUMERO.getText());
        nome = TXT_NOME.getText();
        partido = TXT_PARTIDO.getText();
        urlFoto = TXT_URL_FOTO.getText();
        vice = TXT_VICE.getText();
        urlFotoVice = TXT_URL_FOTO_VICE.getText();

        String sql = "insert governador values(?,?,?,?,?,?,?)";

        String url = "jdbc:mysql://127.0.0.1:3306/eleicao";
        String user = "root";
        String senha = "shieldcorrupted";

        try{
            Connection conexao = DriverManager.getConnection(url, user, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, numero);
            comando.setString(2, nome);
            comando.setString(3, partido);
            comando.setString(4, vice);
            comando.setString(5, urlFoto);
            comando.setString(6, urlFotoVice);
            comando.setInt(7, 0);
            comando.executeUpdate();

            comando.close();
            conexao.close();

            JOptionPane.showMessageDialog(null, "CANDIDATO REGISTRADO!");

            TXT_NUMERO.setText(null);
            TXT_NOME.setText(null);
            TXT_PARTIDO.setText(null);
            TXT_URL_FOTO.setText(null);
            TXT_VICE.setText(null);
            TXT_URL_FOTO_VICE.setText(null);
            LBL_FOTO.setIcon(null);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL CADASTRAR O CANDIDATO!"
                + "\nTENTE NOVAMENTE!");
            erro.printStackTrace();
        }
    }//GEN-LAST:event_BTN_INSERIRActionPerformed

    private void BTN_EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EDITARActionPerformed
        numero = Integer.parseInt(TXT_NUMERO.getText());
        nome = TXT_NOME.getText();
        partido = TXT_PARTIDO.getText();
        urlFoto = TXT_URL_FOTO.getText();
        vice = TXT_VICE.getText();
        urlFotoVice = TXT_URL_FOTO_VICE.getText();

        String sql = "update governador set GOV_NUMERO = ?, GOV_NOME = ?, GOV_SIGPARTIDO = ?, GOV_VICE = ?, GOV_FOTO = ?, GOV_FOTO_VICE = ? where GOV_NUMERO = ?";

        String url = "jdbc:mysql://127.0.0.1:3306/eleicao";
        String user = "root";
        String senha = "shieldcorrupted";

        try{
            Connection conexao = DriverManager.getConnection(url, user, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, numero);
            comando.setString(2, nome);
            comando.setString(3, partido);
            comando.setString(4, vice);
            comando.setString(5, urlFoto);
            comando.setString(6, urlFotoVice);
            comando.setInt(7, numero);
            comando.executeUpdate();

            comando.close();
            conexao.close();

            JOptionPane.showMessageDialog(null, "DADOS ATUALIZADOS!");

            TXT_NUMERO.setText(null);
            TXT_NOME.setText(null);
            TXT_PARTIDO.setText(null);
            TXT_URL_FOTO.setText(null);
            TXT_VICE.setText(null);
            TXT_URL_FOTO_VICE.setText(null);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL EDITAR OS DADOS DO CANDIDATO!"
                + "\nTENTE NOVAMENTE!");
            erro.printStackTrace();
        }
    }//GEN-LAST:event_BTN_EDITARActionPerformed

    private void BTN_LISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LISTARActionPerformed
        String sql = "select * from governador";

        String url = "jdbc:mysql://127.0.0.1:3306/eleicao";
        String user = "root";
        String senha = "shieldcorrupted";

        try{
            Connection conexao = DriverManager.getConnection(url, user, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            ResultSet busca = comando.executeQuery();

            DefaultTableModel model = (DefaultTableModel)TBL_GOV_PRE.getModel();
            if(model.getRowCount()>0){
                model.setRowCount(0);
            }

            while(busca.next()==true){
                numero = busca.getInt("GOV_NUMERO");
                nome = busca.getString("GOV_NOME");
                vice = busca.getString("GOV_VICE");
                partido = busca.getString("GOV_SIGPARTIDO");

                Object[] linha = new Object[TBL_GOV_PRE.getColumnCount()];

                linha[0] = numero;
                linha[1] = nome;
                linha[2] = vice;
                linha[3] = partido;

                model.addRow(linha);
            }

            busca.close();
            comando.close();
            conexao.close();

        }catch(SQLException erro){
            erro.printStackTrace();
        }
    }//GEN-LAST:event_BTN_LISTARActionPerformed

    private void BTN_LIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LIMPARActionPerformed
        TXT_NUMERO.setText(null);
        TXT_NOME.setText(null);
        TXT_PARTIDO.setText(null);
        TXT_URL_FOTO.setText(null);
        TXT_VICE.setText(null);
        TXT_URL_FOTO_VICE.setText(null);
        LBL_FOTO.setIcon(null);
    }//GEN-LAST:event_BTN_LIMPARActionPerformed

    private void BTN_VOLTAR_MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VOLTAR_MENUActionPerformed
        MenuUrna tela = new MenuUrna();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_VOLTAR_MENUActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroGovernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroGovernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroGovernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroGovernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroGovernador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BUSCAR;
    private javax.swing.JButton BTN_EDITAR;
    private javax.swing.JButton BTN_EXCLUIR;
    private javax.swing.JButton BTN_INSERIR;
    private javax.swing.JButton BTN_LIMPAR;
    private javax.swing.JButton BTN_LISTAR;
    private javax.swing.JButton BTN_VOLTAR_MENU;
    private javax.swing.JLabel LBL_BRASAO;
    private javax.swing.JLabel LBL_FOTO;
    private javax.swing.JLabel LBL_NOME;
    private javax.swing.JLabel LBL_NUMERO;
    private javax.swing.JLabel LBL_PARTIDO;
    private javax.swing.JLabel LBL_URL_FOTO;
    private javax.swing.JLabel LBL_URL_FOTO_VICE;
    private javax.swing.JLabel LBL_VICE;
    private javax.swing.JPanel PNL_TELA;
    private javax.swing.JScrollPane SCP_GOV_PRE;
    private javax.swing.JTable TBL_GOV_PRE;
    private javax.swing.JTextField TXT_NOME;
    private javax.swing.JTextField TXT_NUMERO;
    private javax.swing.JTextField TXT_PARTIDO;
    private javax.swing.JTextField TXT_URL_FOTO;
    private javax.swing.JTextField TXT_URL_FOTO_VICE;
    private javax.swing.JTextField TXT_VICE;
    // End of variables declaration//GEN-END:variables
}
