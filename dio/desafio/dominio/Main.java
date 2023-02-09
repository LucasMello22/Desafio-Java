/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Java");
    curso1.setDescricao("Descrição curso java");
    curso1.setCargaHoraria(8);
    
    Curso curso2 = new Curso();
    curso2.setTitulo("JavaScript");
    curso2.setDescricao("Descrição curso javaScript");
    curso2.setCargaHoraria(4);
    
    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("mentoria de Java");
    mentoria1.setDescricao("desc. Mentoria Java");
    mentoria1.setData(LocalDate.now());
    
   
System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria1);
    }
    
}
