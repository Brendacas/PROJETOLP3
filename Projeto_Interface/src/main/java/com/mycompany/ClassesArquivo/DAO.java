/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ClassesArquivo;

/**
 *
 * @author estevao
 */
public interface DAO {
    public void CreateArchive(String name);
    public void ReadArchive(String name);
    public void UpdateArchive(String name);
    public void DeleteArchive(String name);
}
