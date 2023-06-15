/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Classes_Form;
import javax.swing.JOptionPane;

/**
 *
 * @author castr
 */
public class AlunoForm extends javax.swing.JInternalFrame {

    public AlunoForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        IdDisc = new javax.swing.JLabel();
        TextFieldIDDisc = new javax.swing.JTextField();
        jButtonTrancar = new javax.swing.JButton();
        jButtonVerNota = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Ambiente do Estudante");

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Imagens/imgPadrao.png"))); // NOI18N
        img.setText("img");

        IdDisc.setText("ID da disciplina:");

        TextFieldIDDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIDDiscActionPerformed(evt);
            }
        });

        jButtonTrancar.setText("Trancar");
        jButtonTrancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrancarActionPerformed(evt);
            }
        });

        jButtonVerNota.setText("Ver Nota");
        jButtonVerNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerNotaActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdDisc)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonTrancar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonVerNota)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpar))
                                .addComponent(TextFieldIDDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdDisc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldIDDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTrancar)
                    .addComponent(jButtonVerNota)
                    .addComponent(jButtonLimpar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldIDDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIDDiscActionPerformed
      
    }//GEN-LAST:event_TextFieldIDDiscActionPerformed

    private void jButtonTrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrancarActionPerformed
        JOptionPane.showMessageDialog(null, "Disciplina Trancada com sucesso");
        dispose();
    }//GEN-LAST:event_jButtonTrancarActionPerformed

    private void jButtonVerNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerNotaActionPerformed
        JOptionPane.showMessageDialog(null, "Sua nota é: ");
        dispose();
    }//GEN-LAST:event_jButtonVerNotaActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        TextFieldIDDisc.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdDisc;
    private javax.swing.JTextField TextFieldIDDisc;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonTrancar;
    private javax.swing.JButton jButtonVerNota;
    // End of variables declaration//GEN-END:variables
}
