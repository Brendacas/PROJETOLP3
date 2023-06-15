/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Classes_base;

/**
 *
 * @author castr
 */
public class Disciplina {

    String nomeDisciplina, codigoDisciplina;
    float[] notas;
    int creditos = 0;
    static int cont = 0;
    public Aluno[] alunosMatriculados;
    public int nAlunosMatriculados;

    // construtor
    public Disciplina(String nomeDisciplina, String codigoDisciplina, int creditos, int maxAlunos) {

        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        if (verificarCreditos()) {
            this.creditos = creditos;
        }
        this.alunosMatriculados = new Aluno[maxAlunos];
        this.nAlunosMatriculados = 0;

    }
    public Disciplina (){
        this.nomeDisciplina = "NULL";
        this.codigoDisciplina = "NULL";
        this.creditos = 0;
    }

    // getter's
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public int getCredito() {
        return creditos;
    }

    public float[] getNotas() {
        return notas;
    }

    // setter's
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
        
    }

    //Métodos
    private boolean verificarCreditos() {
        if (creditos > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionaNota(float nota) {
        if (cont <= creditos) {
            notas[cont++] = nota;
        }
    }

    protected boolean calcularMedia(float[] notas, int creditos) {
        float somaNotas = 0;
        float media = 0;
        int somaCreditos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * creditos;
            somaCreditos += creditos;
        }
        media = somaNotas / somaCreditos;
        return false;
    }

    public boolean alunoMatriculado(String matricula) {
        for (Aluno aluno : alunosMatriculados) {
            return matricula.equals(aluno.getMatricula());
        }
        return false;
    }

    public void CadastrarAlunoDisciplina(Aluno aluno) {
        if (nAlunosMatriculados < alunosMatriculados.length) {
            alunosMatriculados[nAlunosMatriculados] = aluno;
            nAlunosMatriculados++;
        }
    }


    /*  public String toString (){
        return "Cod: " + codigoDisciplina + " Disciplina " + nomeDisciplina + " C/Horaria: " + cargaHoraria +
        "Creditos: " + creditos + "\n" + "Docente: " + Professor.getNomeString();
    }*/
    /*
     void setNotas(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     */
}