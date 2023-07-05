/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ClassesArquivo;

import java.util.ArrayList;

/**
 *
 * @author estevao
 */
public interface DAO {
    public void createArchive(String nome);

    public void ReadArchive(String nome);

<<<<<<< HEAD
    public void UpdateArchive(String nomeArquivo, String name, String matricula, String email, String Senha);

    public void DeleteArchive(String nomeArquivo, String ID);

    public void WriterArchive(String nome);
=======
    public void UpdateArchive(String name, String matricula, String email, String Senha);

    public void DeleteArchive(ArrayList<String> Linhas, String nome);
>>>>>>> abb406f7540a261bb199330f6eb1dd28e7ff126c
}
