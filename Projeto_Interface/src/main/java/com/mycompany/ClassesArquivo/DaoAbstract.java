
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

<<<<<<< HEAD

public class DaoAbstract implements DAO {
=======
/**
 *
 * @author estevao
 */
public abstract class DaoAbstract implements DAO {
    // Path diretorio = Paths.get("documentos/java...");
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c

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
<<<<<<< HEAD
        String csvArquivo = "aluno.csv";
=======
        String csvArquivo = "caminho";
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c

        BufferedReader conteudoCSV = null;

        String linha = "";
<<<<<<< HEAD

=======
        String csvSeparadorCampo = ";";
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c
        try {
            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoCSV.readLine()) != null) {
<<<<<<< HEAD
                String[] elemento = linha.split(";");
                System.out.println("Matricula: " + elemento[0] + " Nome: " + elemento[1]); 
=======
                String[] elemento = linha.split(csvSeparadorCampo);
                System.out.print("dcolunas"); // printar as colunas
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c
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
<<<<<<< HEAD

    public void WriterArchive(String nome) {
        String csvArquivo = "aluno.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvArquivo, true))) {

            bw.write("202121125;Brenda;");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
=======

    @Override
    public void UpdateArchive(String name, String id, String email, String Senha) {

        ArrayList<String> LinhasArquivo = new ArrayList<String>();
        LinhasArquivo = ReadArchive(NomeArquivo);
        boolean achou = false;
        for (int i = 0; i < LinhasArquivo.size(); i++) {

            if (achou) {
                UpdateArchive(LinhasArquivo, NomeArquivo);
            }
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c
        }
    }

    @Override
<<<<<<< HEAD
    public void UpdateArchive(String nomeArquivo, String id, String name, String email, String senha) {

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
=======
    public void Delete(String ID, String NomeArquivo) {

        ArrayList<String> LinhasArquivo = new ArrayList<String>();
        LinhasArquivo = ReadArchive(NomeArquivo);
        boolean achou = false;
        for (int i = 0; i < LinhasArquivo.size(); i++) {
            String[] Compare = LinhasArquivo.get(i).split(",");
            for (String S : Compare) {
                if (S.equals(ID)) {
                    LinhasArquivo.remove(i);
                    achou = true;
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DaoAbstract.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD

        // armazenados no ArrayList depois escreve
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

        //a.WriterArchive("aluno.csv");
        //a.ReadArchive("aluno.csv");
        //a.UpdateArchive("aluno.csv", "202121125", "Israel", "israel@uesc", "sdsef");
        a.DeleteArchive("aluno.csv", "202121125");
=======
        if (achou)
            UpdateArchive(LinhasArquivo, NomeArquivo);
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c
    }
}
