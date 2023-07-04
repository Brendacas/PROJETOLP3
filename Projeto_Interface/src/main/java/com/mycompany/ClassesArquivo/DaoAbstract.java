/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClassesArquivo;

import com.mycompany.Classes_base.Aluno;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
<<<<<<< HEAD
import java.io.IOException;
import java.util.ArrayList;
=======
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;
>>>>>>> 3513ff6cf6eea728993fc4b0d0dac70f8d894701
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author estevao
 */
<<<<<<< HEAD
public abstract class DaoAbstract implements DAO {

    @Override
    public void CreateArchive(String nome) {

        try {

            File ObjectFile = new File(nome);
            ObjectFile.createNewFile();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

=======
public abstract class DaoAbstract implements DAO{
    //Path diretorio = Paths.get("documentos/java...");
    
    @Override
    public void createArchive(String name) {
        try {
            File arquivo = new File(name);
            
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
>>>>>>> 3513ff6cf6eea728993fc4b0d0dac70f8d894701
    }

    @Override
<<<<<<< HEAD
    public void ReadArchive(String nome) {

=======
    public void ReadArchive(String name){
        String  csvArquivo = "caminho";
        
        BufferedReader conteudoCSV = null;
        
        String linha = "";
        String csvSeparadorCampo = ";";
        try{
            conteudoCSV = new BufferedReader (new FileReader(csvArquivo));
            
            while ((linha = conteudoCSV.readLine())!=null){
                String[] elemento = linha.split(csvSeparadorCampo);
                System.out.print("dcolunas"); //printar as colunas
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado : \n" +e.getMessage());
        }finally{
            if (conteudoCSV != null){
                try {
                    conteudoCSV.close();
                }catch(IOException e){
                    System.out.println("IO erro: \n" + e.getMessage());
                }
            }
        }
>>>>>>> 3513ff6cf6eea728993fc4b0d0dac70f8d894701
    }

    @Override
<<<<<<< HEAD
    public void UpdateArchive(String name, String id, String email, String Senha) {

        ArrayList<String> LinhasArquivo = new ArrayList<String>();
        LinhasArquivo = ReadArchive(NomeArquivo);
        boolean achou = false;
        for (int i = 0; i < LinhasArquivo.size(); i++) {
=======
    public void UpdateArchive(ArrayList<String> Linhas, String nome){
         ArrayList<String> LinhasArquivo = new ArrayList<String>();
        LinhasArquivo = ReadArchive(NomeArquivo);
        boolean achou = false;
        for(int i =0; i< LinhasArquivo.size(); i++){
>>>>>>> 3513ff6cf6eea728993fc4b0d0dac70f8d894701
            String[] Compare = LinhasArquivo.get(i).split(",");
            for (String S : Compare) {
                if (S.equals(ID)) {
                    LinhasArquivo.remove(i);
                    achou = true;
                }
            }
        }
<<<<<<< HEAD
        if (achou) {
            UpdateArchive(LinhasArquivo, NomeArquivo);
        }
    }
}

@Override
public void DeleteArchive(String nome) {
        File ObjectFile = new File(nome);

        if (!ObjectFile.exists()) {
            ObjectFile.delete();
        }

=======
        if (achou) UpdateArchive(LinhasArquivo, NomeArquivo); 
    }
        
 
    @Override
   public void Delete(String ID, String NomeArquivo){

        ArrayList<String> LinhasArquivo = new ArrayList<String>();
        LinhasArquivo = ReadArchive(NomeArquivo);
        boolean achou = false;
        for(int i =0; i< LinhasArquivo.size(); i++){
            String[] Compare = LinhasArquivo.get(i).split(",");
            for (String S : Compare) {
                if (S.equals(ID)) {
                    LinhasArquivo.remove(i);
                    achou = true;
                }
            }
        }
        if (achou) UpdateArchive(LinhasArquivo, NomeArquivo); 
>>>>>>> 3513ff6cf6eea728993fc4b0d0dac70f8d894701
    }
}
