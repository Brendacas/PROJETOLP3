package com.mycompany.Tela_Cadastro;

//Importação de pacotes necessários
//import com.mycompany.ClassesArquivo.DaoAbstract;
import com.mycompany.ClassesArquivo.DaoAbstract;
import javax.swing.JOptionPane;
import com.mycompany.Classes_base.Disciplina;

public class TelaCadastroDisciplina extends javax.swing.JInternalFrame {

    public TelaCadastroDisciplina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelIdProfessor = new javax.swing.JLabel();
        jLabelCodigoDisciplina = new javax.swing.JLabel();
        jLabelNumeroCreditos = new javax.swing.JLabel();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        TextFieldTitulo = new javax.swing.JFormattedTextField();
        TextFieldNumeroCreditos = new javax.swing.JFormattedTextField();
        TextFieldIdProfessor = new javax.swing.JFormattedTextField();
        TextFieldCodigDisc = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(461, 244));

        jLabelTitulo.setText("Titulo da disciplina:");

        jLabelIdProfessor.setText("ID do professor");

        jLabelCodigoDisciplina.setText("Codigo da disciplina:");

        jLabelNumeroCreditos.setText("Numero de creditos:");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonLimpar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCodigoDisciplina)
                                    .addComponent(TextFieldCodigDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldTitulo))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo)
                                .addGap(90, 90, 90)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldIdProfessor)
                            .addComponent(TextFieldNumeroCreditos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumeroCreditos)
                                    .addComponent(jLabelIdProfessor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelNumeroCreditos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldNumeroCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoDisciplina)
                    .addComponent(jLabelIdProfessor))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCodigDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonSalvar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed

        String nomeDisciplina = TextFieldTitulo.getText();
        String codigo = TextFieldCodigDisc.getText();
        String creditos = TextFieldNumeroCreditos.getText();
        String iD = TextFieldIdProfessor.getText();
        String iDProfessor = TextFieldIdProfessor.getText();
        
        if (!nomeDisciplina.isEmpty() && !codigo.isEmpty() && !creditos.isEmpty() && !iD.isEmpty()) {
            
            Disciplina novaDisciplina = new Disciplina();
            
            novaDisciplina.setNomeDisciplina(nomeDisciplina);
            novaDisciplina.setCodigoDisciplina(codigo);
            novaDisciplina.setCreditos(Integer.parseInt(creditos));
            
            DaoAbstract arquivo = new DaoAbstract();
            
            arquivo.WriterArchive("disciplina.csv", novaDisciplina.getCodigoDisciplina() + ";" + novaDisciplina.getNomeDisciplina() + ";" + 
                    Integer.toString(novaDisciplina.getCredito()) + ";" + iDProfessor);
            
        } else {
            JOptionPane.showMessageDialog(null, "ID do Professor inválido");
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        //Botão limpar
        TextFieldCodigDisc.setText(" ");
        TextFieldIdProfessor.setText(" ");
        TextFieldNumeroCreditos.setText(" ");
        TextFieldTitulo.setText(" ");
        
    }//GEN-LAST:event_ButtonLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JFormattedTextField TextFieldCodigDisc;
    private javax.swing.JFormattedTextField TextFieldIdProfessor;
    private javax.swing.JFormattedTextField TextFieldNumeroCreditos;
    private javax.swing.JFormattedTextField TextFieldTitulo;
    private javax.swing.JLabel jLabelCodigoDisciplina;
    private javax.swing.JLabel jLabelIdProfessor;
    private javax.swing.JLabel jLabelNumeroCreditos;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
