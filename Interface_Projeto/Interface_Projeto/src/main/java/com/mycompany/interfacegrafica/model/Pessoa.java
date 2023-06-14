package com.mycompany.interfacegrafica.model;

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

    public String getCpfInt() {
        return cpf;
    }

    public void setCpfInt(String cpfInt) {
        this.cpf = cpfInt;
    }

}
