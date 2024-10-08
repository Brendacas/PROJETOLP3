package com.mycompany.ClassesArquivo;

import java.util.ArrayList;

public interface DAO {
    //Linux >> WINDOWS
    public void createArchive(String nomeArquivo);

    public ArrayList<String> ReadArchive(String nomeArquivo);

    public void UpdateArchive(String nomeArquivo, String novaLinha, String ID);

    public void DeleteArchive(String nomeArquivo, String ID);

    public void WriterArchive(String nomeArquivo, ArrayList<String> novaLinha);
        
    public void WriterArchive(String nomeArquivo, String novaLinha);
}
