import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romana Silva
 */
public class AdministradorVIEW extends javax.swing.JFrame {
    public AdministradorVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro de Alunos");
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaAln = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeAln = new javax.swing.JTextField();
        txtTelefoneAln = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtCursoAln = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCPFAln = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataNascAln = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblListaAln.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Curso", "Data de Nascimento", "CPF"
            }
        ) {
            final Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, String.class, java.lang.String.class
            };
            final boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaAln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaAlnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaAln);
        if (tblListaAln.getColumnModel().getColumnCount() > 0) {
            for(int i = 0; i <= 5; i ++){
                tblListaAln.getColumnModel().getColumn(i).setResizable(false);
            }
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Alunos Cadastrados");

        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Cadastrar Aluno");

        jLabel4.setText("Data de Nascimento:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnEditar.setText("Atualizar Dados");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel5.setText("Curso:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeAln, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTelefoneAln)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCursoAln, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 12, Short.MAX_VALUE))
                                    .addComponent(txtDataNascAln))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCPFAln, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrar)))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneAln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCursoAln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar)
                            .addComponent(txtDataNascAln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFAln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnEditar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cadastrar aluno
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Aluno objAluno = new Aluno(
                txtNomeAln.getText(),
                txtTelefoneAln.getText(),
                txtCursoAln.getText(),
                txtDataNascAln.getText(),
                txtCPFAln.getText()
        );

        alunosDB.addAluno(objAluno);

        Object[] cols = {"ID", "Nome", "Telefone", "Curso", "Data de Nascimento", "CPF"};

        DefaultTableModel tblAlunos = (DefaultTableModel) tblListaAln.getModel();
        tblAlunos.setDataVector(alunosDB.getAlunosObj(), cols);

        tblAlunos.fireTableDataChanged();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Remover Aluno
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if(tblListaAln.getSelectedRow() != -1){
        String idAluno = tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 0).toString();
        alunosDB.dropAluno(idAluno);

        Object[] cols = {"ID", "Nome", "Telefone", "Curso", "Data de Nascimento", "CPF"};

        DefaultTableModel tblAlunos = (DefaultTableModel) tblListaAln.getModel();
        tblAlunos.setDataVector(alunosDB.getAlunosObj(), cols);

        tblAlunos.fireTableDataChanged();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para excluir.");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblListaAln.getSelectedRow() != -1){
            Aluno aluno = new Aluno(
                    tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 0).toString(), // ID
                    txtNomeAln.getText(), // Nome
                    txtTelefoneAln.getText(), // Telefone
                    txtCursoAln.getText(), // Curso
                    txtDataNascAln.getText(), // Data de nascimento
                    txtCPFAln.getText() // CPF
            );

            alunosDB.updateAluno(aluno);

            Object[] cols = {"ID", "Nome", "Telefone", "Curso", "Data de Nascimento", "CPF"};

            DefaultTableModel tblAlunos = (DefaultTableModel) tblListaAln.getModel();
            tblAlunos.setDataVector(alunosDB.getAlunosObj(), cols);

            tblAlunos.fireTableDataChanged();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para editar.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblListaAlnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaAlnMouseClicked
        if(tblListaAln.getSelectedRow() != -1){
        txtNomeAln.setText(tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 1).toString());
        txtTelefoneAln.setText(tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 2).toString());
        txtCursoAln.setText(tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 3).toString());
        txtDataNascAln.setText(tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 4).toString());
        txtCPFAln.setText(tblListaAln.getValueAt(tblListaAln.getSelectedRow(), 5).toString());
        
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para editar.");
        }
    }//GEN-LAST:event_tblListaAlnMouseClicked

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
            java.util.logging.Logger.getLogger(AdministradorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaAln;
    private javax.swing.JTextField txtCPFAln;
    private javax.swing.JTextField txtCursoAln;
    private javax.swing.JTextField txtDataNascAln;
    private javax.swing.JTextField txtNomeAln;

    private javax.swing.JTextField txtTelefoneAln;

    private AlunosDB alunosDB = new AlunosDB();
}
