/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import agenda_crud.Contatos_crud;
import conection.ConnectionDB;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import servicesAgenda.Agenda;
import servicesAgenda.ServicoAgenda;

/**
 *
 * @author augusto.palencar1
 */
public class AgendaContatos extends javax.swing.JFrame {

    ConnectionDB con = new ConnectionDB();
    Contatos_crud contatos = new Contatos_crud();
    Agenda agenda = new Agenda();
    Editar editar = null;

    /**
     * Creates new form Agenda
     */
    public AgendaContatos() {
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

        cadastrar = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        data_nasc = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jnome = new javax.swing.JTextField();
        jdata_nasc = new javax.swing.JTextField();
        jtelefone = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        JbuttonCadastrar = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        panelListar = new javax.swing.JPanel();
        jbuttonListar = new javax.swing.JButton();
        nomeBuscar = new javax.swing.JLabel();
        Jbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_contatos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar")));

        nome.setText("Nome:");

        data_nasc.setText("Data de nascimento:");

        telefone.setText("Telefone:");

        email.setText("E-mail:");

        jdata_nasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdata_nascActionPerformed(evt);
            }
        });

        JbuttonCadastrar.setText("Cadastrar");
        JbuttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonCadastrarActionPerformed(evt);
            }
        });

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:", "Masculino", "Feminino" }));

        jLabel1.setText("Sexo:");

        javax.swing.GroupLayout cadastrarLayout = new javax.swing.GroupLayout(cadastrar);
        cadastrar.setLayout(cadastrarLayout);
        cadastrarLayout.setHorizontalGroup(
            cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(data_nasc)
                        .addComponent(nome, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(telefone, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jnome, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addComponent(jdata_nasc)
                        .addComponent(jtelefone)
                        .addComponent(jemail))
                    .addGroup(cadastrarLayout.createSequentialGroup()
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(JbuttonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cadastrarLayout.setVerticalGroup(
            cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_nasc)
                    .addComponent(jdata_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(jtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(JbuttonCadastrar))
                .addContainerGap())
        );

        panelListar.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar contatos"));

        jbuttonListar.setText("Listar contatos");
        jbuttonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonListarActionPerformed(evt);
            }
        });

        nomeBuscar.setText("Nome:");

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabela_contatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Data Nasc", "Telefone", "E-mail", "Sexo", "Data e hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela_contatos);

        javax.swing.GroupLayout panelListarLayout = new javax.swing.GroupLayout(panelListar);
        panelListar.setLayout(panelListarLayout);
        panelListarLayout.setHorizontalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLayout.createSequentialGroup()
                .addGroup(panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelListarLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(nomeBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbuttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        panelListarLayout.setVerticalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonListar)
                    .addComponent(nomeBuscar)
                    .addComponent(Jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdata_nascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdata_nascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdata_nascActionPerformed

    private void JbuttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonCadastrarActionPerformed
        // TODO add your handling code here:
        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());      
        try {
            agenda.setNome((String) jnome.getText());
            agenda.setDataNasc((String) jdata_nasc.getText());
            agenda.setTelefone((String) jtelefone.getText());
            agenda.setEmail((String) jemail.getText());
            agenda.setSexo((String) jComboBoxSexo.getSelectedItem());
            agenda.setDataCad(dataDeHoje);             
            ServicoAgenda.cadastrarAgenda(agenda);

        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        jnome.setText("");
        jdata_nasc.setText("");
        jtelefone.setText("");
        jemail.setText("");
        jComboBoxSexo.setSelectedItem("Selecione:");


    }//GEN-LAST:event_JbuttonCadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:       
        int row = tabela_contatos.getSelectedRow();
        if(row >=0){
        String nome = (String) tabela_contatos.getValueAt(row, 1);         
           agenda.setNome(nome);
           
//             try {
//                 contatos.retornarContatosNome(nome);
//             } catch (Exception ex) {
//                 Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
//             }
             
             if (editar == null || !editar.isDisplayable()) {
            editar = new Editar();            
            editar.setVisible(true); 
            try {
                editar.preencherCampos(nome, agenda);
            } catch (SQLException ex) {
                Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }             
        editar.toFront();
        }
        
        else
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbuttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonListarActionPerformed
        if (!Jbuscar.getText().equals("")) {
            try {
                // TODO add your handling code here:
                contatos.procurarNome(tabela_contatos, Jbuscar.getText());
            } catch (SQLException ex) {
                Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                contatos.preencherTabela(tabela_contatos);
            } catch (SQLException ex) {
                Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        Jbuscar.setText("");
    }//GEN-LAST:event_jbuttonListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = tabela_contatos.getSelectedRow();         
        int id = (Integer) tabela_contatos.getValueAt(row, 0);       
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o Contato?");
        if (resposta == JOptionPane.YES_OPTION) {
           agenda.setId(id);
             try {
                 contatos.excluirUsuario(agenda);
             } catch (Exception ex) {
                 Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaContatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jbuscar;
    private javax.swing.JButton JbuttonCadastrar;
    private javax.swing.JPanel cadastrar;
    private javax.swing.JLabel data_nasc;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbuttonListar;
    private javax.swing.JTextField jdata_nasc;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jnome;
    private javax.swing.JTextField jtelefone;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nomeBuscar;
    private javax.swing.JPanel panelListar;
    private javax.swing.JTable tabela_contatos;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables

    private void openFrameInCenter(Editar editar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
