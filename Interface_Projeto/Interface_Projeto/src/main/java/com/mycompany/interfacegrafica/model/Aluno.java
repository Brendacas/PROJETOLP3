package com.mycompany.interfacegrafica.model;


public class Aluno extends Pessoa{
    protected String matricula;
    public Disciplina disciplina;
    public String senhaAluno;
   
 


    public Aluno (String nome, String email, String cpf, String matricula, String senhaAluno){
        super(nome, email, cpf);
        this.matricula = matricula;
        this.senhaAluno = senhaAluno;
    }
    public Aluno(){
        super();
        matricula = "NULL";
    }
    

    public void setMatricula (String matricula){
        this.matricula = matricula;
    }

    public String getMatricula (){
        return matricula;
    }
  
     public boolean autenticar(String matricula, String senha) {
        return this.matricula.equals(matricula) && this.senhaAluno.equals(senha);
    }
    public void calcularMedia() {
        float[] notas = disciplina.getNotas();
        int creditos = disciplina.getCredito();
        disciplina.calcularMedia(notas, creditos);
    }
}

  



