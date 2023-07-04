/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ClassesArquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author estevao
 */
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
    }
    @Override
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

    }
    @Override
    public void UpdateArchive(ArrayList<String> Linhas, String nome){
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
    }
}
