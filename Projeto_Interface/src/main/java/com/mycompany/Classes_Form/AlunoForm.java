/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.Classes_Form;
import com.mycompany.ClassesArquivo.DaoAbstract;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
        TextFieldMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setText("Matricula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonTrancar)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonVerNota)
                            .addGap(49, 49, 49)
                            .addComponent(jButtonLimpar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(IdDisc)
                        .addComponent(TextFieldIDDisc)
                        .addComponent(TextFieldMatricula))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(TextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTrancar)
                    .addComponent(jButtonVerNota)
                    .addComponent(jButtonLimpar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldIDDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIDDiscActionPerformed
      
    }//GEN-LAST:event_TextFieldIDDiscActionPerformed

    private void jButtonTrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrancarActionPerformed
        
        String IDDisciplina = TextFieldIDDisc.getText();
        String Matricula = TextFieldMatricula.getText();
        
        File file = new File(IDDisciplina + ".csv");
        
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "Disciplina inexistente");
        }else{
            
            DaoAbstract dao = new DaoAbstract();
            dao.DeleteArchive(IDDisciplina+".csv", Matricula);
            JOptionPane.showMessageDialog(null, "Disciplina Trancada com sucesso");
            
        }
        dispose();
        
        JOptionPane.showMessageDialog(null, "Disciplina Trancada com sucesso");
        dispose();
    }//GEN-LAST:event_jButtonTrancarActionPerformed

    private void jButtonVerNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerNotaActionPerformed
        
        String IDDisciplina = TextFieldIDDisc.getText();
        String Matricula = TextFieldMatricula.getText();
        
        File file = new File(IDDisciplina + ".csv");
        
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "Disciplina inexistente");
        }else{
            
            List<String> LinhasArquivos = new ArrayList<>();
            DaoAbstract dao = new DaoAbstract();
            
            LinhasArquivos = dao.ReadArchive(IDDisciplina + ".csv");
            
            for(int i = 1; i < LinhasArquivos.size(); i++){
                String []Compare = LinhasArquivos.get(i).split(";");
                
                if(Compare[0].equals(Matricula)){
                    float Nota = (Float.parseFloat(Compare[1]) + Float.parseFloat(Compare[2]) + Float.parseFloat(Compare[3]))/3;
                    JOptionPane.showMessageDialog(null, "Sua nota é: " + Nota);
                }
            }
                        
        }
        dispose();
    }//GEN-LAST:event_jButtonVerNotaActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        TextFieldIDDisc.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdDisc;
    private javax.swing.JTextField TextFieldIDDisc;
    private javax.swing.JTextField TextFieldMatricula;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonTrancar;
    private javax.swing.JButton jButtonVerNota;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
