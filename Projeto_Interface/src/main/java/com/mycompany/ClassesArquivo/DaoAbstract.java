package com.mycompany.ClassesArquivo;

import com.mycompany.Classes_base.Aluno;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author estevao
 */
public abstract class DaoAbstract implements DAO {

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
    public void ReadArchive(String name) {
        String csvArquivo = "aluno.csv";

        BufferedReader conteudoCSV = null;

        String linha = "";

        try {
            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoCSV.readLine()) != null) {
                String[] elemento = linha.split(";");
                System.out.println("Matricula " + elemento[0] + " Nome " + elemento[1]); // printar as colunas
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado : \n" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(DaoAbstract.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("IO erro: \n" + e.getMessage());
                }
            }
        }
    }

    @Override
    public void WriterArchive(String nomeArquivo, String novaLinha) {
     
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {

            bw.write(novaLinha);
            bw.newLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void UpdateArchive(String nomeArquivo, String novaLinha) {

        ArrayList<String> list = new ArrayList();

        // Abre o arquivo e le os dados armazendando em um ArrayList
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;
            String[] item;

            while ((linha = br.readLine()) != null) {

                item = linha.split(";");

                if (item[0].equals(id)) {
                    list.add(id + ";" + name + ";" + email + ";" + senha + ";");
                } else {
                    list.add(linha);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DaoAbstract.class.getName()).log(Level.SEVERE, null, ex);
        }

        //armazenados no ArrayList depois escreve
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {

            for (String a : list) {
                bw.write(a);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void DeleteArchive(String nomeArquivo, String ID) {

        ArrayList<String> LinhasArquivo = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;
            String[] compare;

            while ((linha = br.readLine()) != null) {

                compare = linha.split(";");

                if (!compare[0].equals(ID)){
                    LinhasArquivo.add(linha);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DaoAbstract.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {

            for (String a : LinhasArquivo) {
                bw.write(a);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DaoAbstract a = new DaoAbstract();

         a.WriterArchive("aluno.csv");
        // a.ReadArchive("aluno.csv");
        //a.UpdateArchive("aluno.csv", "202121125", "Israel", "israel@uesc", "sdsef");
        //a.DeleteArchive("aluno.csv", "202121125");
    }

  
}
