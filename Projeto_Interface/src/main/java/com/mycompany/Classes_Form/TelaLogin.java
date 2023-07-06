/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Classes_Form;

import com.mycompany.ClassesArquivo.DaoAbstract;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author estevao
 */
public class TelaLogin extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        LblImg = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtFieldUsuario = new javax.swing.JTextField();
        LblSenha = new javax.swing.JLabel();
        PassFieldSenha = new javax.swing.JPasswordField();
        BtnEntrar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();

        LblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Imagens/imgPadrao.png"))); // NOI18N

        LblUsuario.setText("Usuário:");

        LblSenha.setText("Senha:");

        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblSenha)
                            .addComponent(LblUsuario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PassFieldSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFieldUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(LblImg)))
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEntrar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEntrar)
                    .addComponent(BtnLimpar))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificarUsuario(String usuario, String senha, String nomeArquivo) {
        DaoAbstract dao = new DaoAbstract();

        // Realiza a leitura dos dados do arquivo usando o método ReadArchive do DAO
        ArrayList<String> linhasArquivo = new ArrayList<String>();
        linhasArquivo = dao.ReadArchive(nomeArquivo);
        
        String []Dados;

        for (String linha : linhasArquivo) { 
            Dados = linha.split(";");

            if (usuario.equals(Dados[0]) && senha.equals(Dados[4])) {
                return true;  // Retorna true quando a verificação é bem-sucedida
            }
        }

        return false;   // Retorna false quando nenhuma correspondência é encontrada
    }


    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        TxtFieldUsuario.setText("");
        PassFieldSenha.setText("");
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        boolean ehAluno = false, ehProfessor = false;
        String usuario = TxtFieldUsuario.getText();
        String senha = PassFieldSenha.getText();

        // Verifica se o usuário é um professor
        if (verificarUsuario(usuario, senha, "professor.csv")) {
            ehProfessor = true;
        }

        // Verifica se o usuário é um aluno
        if (verificarUsuario(usuario, senha, "aluno.csv")) {
            ehAluno = true;
        }

        if (usuario.equals("usuario1") && senha.equals("senha1")) {
            JOptionPane.showMessageDialog(null, "Acesso autorizado. Bem-vindo ADM");
            setVisible(false);
            TelaAdmin adm = new TelaAdmin();
            adm.setVisible(true);
        } else if (ehProfessor) {
            JOptionPane.showMessageDialog(null, "Acesso autorizado. Bem-vindo, Professor!");
            dispose();
            ProfessorForm prof = new ProfessorForm();
            prof.setVisible(true);

        } else if (ehAluno) {
            JOptionPane.showMessageDialog(null, "Acesso autorizado. Bem-vindo, Aluno!");
            setVisible(false);
            TelaAluno aluno = new TelaAluno();
            aluno.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
        }

    }//GEN-LAST:event_BtnEntrarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LblImg;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField PassFieldSenha;
    private javax.swing.JTextField TxtFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
