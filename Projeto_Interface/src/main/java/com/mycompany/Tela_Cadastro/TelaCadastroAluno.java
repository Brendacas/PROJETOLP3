package com.mycompany.Tela_Cadastro;

<<<<<<< HEAD
=======
import javax.swing.JOptionPane;
import com.mycompany.Classes_base.Aluno;
>>>>>>> a87b71326058c17bf10c98a48107af10ef11f4b7

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


/**
 *
 * @author israe
 */
public class TelaCadastroAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroAluno
     */
    public TelaCadastroAluno() {
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

        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmaSenha = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JFormattedTextField();
        TextFiledEmail = new javax.swing.JFormattedTextField();
        TextFieldCpf = new javax.swing.JFormattedTextField();
        TextFieldMatricula = new javax.swing.JFormattedTextField();
        TextFieldSenha = new javax.swing.JFormattedTextField();
        TextFieldConfirmaSenha = new javax.swing.JFormattedTextField();
        ButtonSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(478, 310));

        lblNome.setText("Nome: ");

        lblEmail.setText("E - mail:");

        lblMatricula.setText("Matricula:");

        lblCpf.setText("CPF: ");

        lblSenha.setText("Senha:");

        lblConfirmaSenha.setText("Confirmar senha:");

        TextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeActionPerformed(evt);
            }
        });

        TextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMatriculaActionPerformed(evt);
            }
        });

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome)
                    .addComponent(lblCpf)
                    .addComponent(lblSenha)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(TextFieldCpf)
                    .addComponent(TextFieldSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButtonSalvar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMatricula)
                            .addComponent(lblConfirmaSenha)
                            .addComponent(TextFieldConfirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(TextFieldMatricula)
                            .addComponent(TextFiledEmail))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFiledEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpf)
                    .addComponent(lblMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmaSenha)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonSalvar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeActionPerformed

    private void TextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMatriculaActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
       //Criando novo obejto aluno;
        Aluno novo = new Aluno();
        
        String nome = TextFieldNome.getText();
        String email = TextFiledEmail.getText();
        String cpf = TextFieldCpf.getText();
        String matricula = TextFieldMatricula.getText();
        String senha = TextFieldSenha.getText();
        String confirmarSenha = TextFieldConfirmaSenha.getText();
        
        if (!nome.isEmpty() && !email.isEmpty() && !cpf.isEmpty() && !matricula.isEmpty()
                && !senha.isEmpty() && !confirmarSenha.isEmpty()) {
            
            if (senha.equals(confirmarSenha)) {
                
                novo.setNomeString(nome);
                novo.setEmailString(email);
                novo.setCpfInt(cpf);
                novo.setMatricula(matricula);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                
                /*ERRO EM TELA LOGIN FALTA AINDA A TELA LOGING*/
                TelaLogin.setArray_Aluno(novo);
                
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Senhas diferentes!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor, preencha todos os campos!");
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JFormattedTextField TextFieldConfirmaSenha;
    private javax.swing.JFormattedTextField TextFieldCpf;
    private javax.swing.JFormattedTextField TextFieldMatricula;
    private javax.swing.JFormattedTextField TextFieldNome;
    private javax.swing.JFormattedTextField TextFieldSenha;
    private javax.swing.JFormattedTextField TextFiledEmail;
    private javax.swing.JLabel lblConfirmaSenha;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}
