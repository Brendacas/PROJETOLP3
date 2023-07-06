package com.mycompany.Tela_Cadastro;

//Importação de classes necessarias
import com.mycompany.ClassesArquivo.DaoAbstract;
import javax.swing.JOptionPane;
import com.mycompany.Classes_base.Professor;

public class TelaCadastroProfessor extends javax.swing.JInternalFrame {

    public TelaCadastroProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar2 = new javax.swing.JProgressBar();
        LabelNome = new javax.swing.JLabel();
        LabelCpf = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        LabelEMail = new javax.swing.JLabel();
        LabelConfirmaSenha = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        PasswordFieldSenha = new javax.swing.JPasswordField();
        PasswordFieldConfirmaSenha = new javax.swing.JPasswordField();
        TextFieldCpf = new javax.swing.JFormattedTextField();
        TextFieldId = new javax.swing.JTextField();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(438, 320));

        LabelNome.setText("Nome:");

        LabelCpf.setText("CPF:");

        LabelSenha.setText("Senha:");

        LabelEMail.setText("E - mail:");

        LabelConfirmaSenha.setText("Confirma senha:");

        LabelId.setText("ID:");

        TextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCpfActionPerformed(evt);
            }
        });

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonLimpar.setText("Limpar");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordFieldSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(TextFieldCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNome)
                            .addComponent(LabelSenha)
                            .addComponent(LabelCpf))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldEmail)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addComponent(ButtonSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ButtonLimpar))
                                    .addComponent(TextFieldId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordFieldConfirmaSenha, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(8, 8, 8)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEMail)
                            .addComponent(LabelId)
                            .addComponent(LabelConfirmaSenha))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEMail)
                    .addComponent(LabelNome))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCpf)
                    .addComponent(LabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSenha)
                    .addComponent(LabelConfirmaSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordFieldConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalvar)
                    .addComponent(ButtonLimpar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCpfActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed

        //Declaração de variaveis para capturar os elementos digitados
        String nome = TextFieldNome.getText();
        String email = TextFieldEmail.getText();
        String cpf = TextFieldCpf.getText();
        String iD = TextFieldId.getText();
        String senha = PasswordFieldSenha.getText();
        String confirmarSenha = PasswordFieldConfirmaSenha.getText();

        //Verificação de campos vazios
        if (!nome.isEmpty() && !email.isEmpty() && !cpf.isEmpty() && !iD.isEmpty()
                && !senha.isEmpty() && !confirmarSenha.isEmpty()) {

            //Verificação de senha igual
            if (senha.equals(confirmarSenha)) {

                Professor novo = new Professor();
                novo.setNomeString(nome);
                novo.setEmailString(email);
                novo.setCpfString(cpf);
                novo.setID(iD);

                String ProfessorString = (novo.getID() + ";" + novo.getNomeString() + ";" + novo.getCpfString()
                        + ";" + novo.getEmailString() + ";" + senha);
                DaoAbstract DAO = new DaoAbstract();
                DAO.WriterArchive("professor.csv", ProfessorString);

                JOptionPane.showMessageDialog(null, "Cadastro realizado!");

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Senhas diferentes!!!");

            }
        }

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        TextFieldNome.setText(" ");
        TextFieldCpf.setText(" ");
        TextFieldEmail.setText(" ");
        TextFieldId.setText(" ");
        PasswordFieldSenha.setText(" ");
        PasswordFieldConfirmaSenha.setText(" ");

    }//GEN-LAST:event_ButtonLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelConfirmaSenha;
    private javax.swing.JLabel LabelCpf;
    private javax.swing.JLabel LabelEMail;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JPasswordField PasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField PasswordFieldSenha;
    private javax.swing.JFormattedTextField TextFieldCpf;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldId;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
