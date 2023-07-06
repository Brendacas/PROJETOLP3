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
import java.util.List;

/**
 *
 * @author estevao
 */
public class DaoAbstract implements DAO {
    

    @Override
    public void createArchive(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);

            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
            } else {
                System.out.println("O arquivo ja existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<String> ReadArchive(String nomeArquivo) {

        BufferedReader conteudoCSV = null;
        List<String> LinhasArquivo = new ArrayList<>();
        String linha;

        try {
            conteudoCSV = new BufferedReader(new FileReader(nomeArquivo));

            while ((linha = conteudoCSV.readLine()) != null) {
                LinhasArquivo.add(linha);
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
        return (ArrayList<String>) LinhasArquivo;
    }
    @Override
    public void WriterArchive(String nomeArquivo, ArrayList<String> atualizacao) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {

            for (String string : atualizacao) {
                bw.write(string);
                bw.newLine();
            }

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    @Override
    public void WriterArchive(String nomeArquivo, String novalinha){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
                bw.write(novalinha);
                bw.newLine();

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    @Override
    public void UpdateArchive(String nomeArquivo, String novaLinha, String ID) {

        ArrayList<String> list = ReadArchive(nomeArquivo);

        int Ind = -1;

        for (String string : list) {
            Ind++;
            String[] Compare = string.split(";");
            if (Compare[0].equals(ID))
                break;
        }
        
        list.add(Ind, novaLinha);
        // armazenados no ArrayList depois escreve
        WriterArchive(nomeArquivo, list);
    }

    @Override
    public void DeleteArchive(String nomeArquivo, String ID) {

        ArrayList<String> LinhasArquivo = ReadArchive(nomeArquivo);
        int i = -1;
        String[] compare;
        for(String linha : LinhasArquivo){
            i++;
            compare = linha.split(";");
            if (compare[0].equals(ID)) {
                LinhasArquivo.remove(i);
                break;
            }
        }
        WriterArchive(nomeArquivo, LinhasArquivo);
    }

    public static void main(String[] args) {
        DaoAbstract a = new DaoAbstract();

        // a.WriterArchive("aluno.csv", "202121125");
        a.ReadArchive("aluno.csv");
        // a.UpdateArchive("aluno.csv", "202121125", "Israel", "israel@uesc", "sdsef");
        // a.DeleteArchive("aluno.csv", "202121126");
    }

}
