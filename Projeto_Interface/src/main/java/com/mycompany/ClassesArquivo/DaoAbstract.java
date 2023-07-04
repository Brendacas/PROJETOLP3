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
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estevao
 */
public abstract class DaoAbstract implements DAO {

    @Override
    public void CreateArchive(String nome) {

        try {

            File ObjectFile = new File(nome);
            ObjectFile.createNewFile();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

    }

    @Override
    public void ReadArchive(String nome) {

    }

    @Override
    public void UpdateArchive(String name, String id, String email, String Senha) {

        ArrayList<String> LinhasArquivo = new ArrayList<String>();
        LinhasArquivo = ReadArchive(NomeArquivo);
        boolean achou = false;
        for (int i = 0; i < LinhasArquivo.size(); i++) {
            String[] Compare = LinhasArquivo.get(i).split(",");
            for (String S : Compare) {
                if (S.equals(ID)) {
                    LinhasArquivo.remove(i);
                    achou = true;
                }
            }
        }
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

    }
}
