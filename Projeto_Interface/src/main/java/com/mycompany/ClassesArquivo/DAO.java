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
<<<<<<< HEAD
    public void CreateArchive(String name);
    public void ReadArchive(String name);
    public void UpdateArchive(String name, String matricula, String email, String Senha);
    public void DeleteArchive(String name);
=======
    public void createArchive(String nome);
    public void ReadArchive(String nome);
    public void UpdateArchive(ArrayList<String> Linhas,String nome);
    public void DeleteArchive(ArrayList<String> Linhas,String nome);
>>>>>>> 3513ff6cf6eea728993fc4b0d0dac70f8d894701
}
