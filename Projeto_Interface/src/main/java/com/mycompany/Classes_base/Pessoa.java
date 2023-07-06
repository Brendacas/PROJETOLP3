/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Classes_base;

/**
 *
 * @author castr
 */
public class Pessoa {
    
    protected String nomeString, emailString;
    protected String cpf;

    //Construtores
    public Pessoa(String nome, String email, String cpf){
        this.nomeString = nome;
        this.emailString = email;
        this.cpf = cpf;
    }
    public Pessoa(){
        nomeString = "NULL";
        emailString = "NULL";
        cpf = "NULL";
    }

    //Gette's and Sette's
    public String getNomeString() {
        return nomeString;
    }

    public void setNomeString(String nomeString) {
        this.nomeString = nomeString;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public String getCpfString() {
        return cpf;
    }

    public void setCpfString(String cpfInt) {
        this.cpf = cpfInt;
    }

}
