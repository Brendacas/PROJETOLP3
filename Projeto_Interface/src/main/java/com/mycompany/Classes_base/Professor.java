/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Classes_base;

/**
 *
 * @author castr
 */
public class Professor extends Pessoa {

    protected String iD;
    Disciplina disciplina;
    public String senhaProf;

    //Construtor
    public Professor(String nome, String email, String cpf, String id, Disciplina disciplina) {
        super(nome, cpf, email);
        this.iD = id;
        this.disciplina = disciplina;
 
    }
    public Professor(){
        super();
        iD = "NULL";
        disciplina = new Disciplina();
    }

    //get e set
    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public void adicionaNotaAluno(float nota, Aluno aluno) {
        disciplina.adicionaNota(nota);
    }
    
    public void setDisciplina(Disciplina disciplina){
         this.disciplina = disciplina;
     }
    public boolean autenticar(String id, String senha) {
        return this.iD.equals(id) && this.senhaProf.equals(senha);
    }
    
    public String getInfo() {
        return "Nome: " + this.getNomeString() + "\nCPF: " + this.getCpfInt() + "\nEmail: " + this.getEmailString() + "\nID: " + this.getID() + "\n";
    }


 
   
   
}