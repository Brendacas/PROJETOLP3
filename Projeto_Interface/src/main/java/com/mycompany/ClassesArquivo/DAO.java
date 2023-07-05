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

    public void UpdateArchive(String nomeArquivo, String name, String matricula, String email, String Senha);
<<<<<<< HEAD

    public void DeleteArchive(String nomeArquivo, String ID);

    public void WriterArchive(String nome);
=======

    public void DeleteArchive(String nomeArquivo, String ID);

    public void WriterArchive(String nome);

>>>>>>> 3a52089d8d925e7656864ad11c15e8d0d0cd224f
}
