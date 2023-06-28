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
import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estevao
 */
public abstract class DaoAbstract implements DAO{
    
    @Override
    public void CreateArchive(String nome){
        
        try {
            
            File ObjectFile = new File(nome);
            ObjectFile.createNewFile();
            
        } catch (IOException ex) {
            
            ex.printStackTrace();
            
        }
        
    }
    @Override
    public void ReadArchive(String nome){
        
    }
    @Override
    public void UpdateArchive(String nome){
        
    }
    @Override
    public void DeleteArchive(String nome){
        File ObjectFile = new File(nome);
        
        if (!ObjectFile.exists()) ObjectFile.delete();
       
    }
}
