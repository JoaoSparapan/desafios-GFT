/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.AtorDAO;
import DAO.ModeloDAO;
import Modelo.Ator;
import Modelo.Modelo;
import java.util.Scanner;

/**
 *
 * @author spara
 */
public class AtorTela {
     public static void main(String[] args) {
        AtorDAO ad = new AtorDAO();
        ModeloDAO md = new ModeloDAO();
        Scanner ler = new Scanner(System.in);
        String trabalho;
        boolean vrf=false;
        int opc=-1;
        Ator at;
        Modelo mo;
        do{
            System.out.println("Informe o tipo de trabalho: (Malhação ou Novela)");
            trabalho = ler.nextLine();
            
            if(!"NOVELA".equals(trabalho.toUpperCase()) && !"MALHAÇÃO".equals(trabalho.toUpperCase())){
                System.out.println("O trabalho deve ser Malhação ou Novela (não esqueça dos acentos)");
                vrf=false;
            }else{
                if(trabalho.toUpperCase().equals("NOVELA")){
                    at = new Ator();
                    System.out.println("Informe o nome do ator: ");
                    at.setNome(ler.nextLine());
                    System.out.println("Informe a idade do ator: ");
                    at.setIdade(ler.nextInt());
                    System.out.println("Informe o nivel do ator: ");
                    at.setNivelAtor(ler.nextInt());
                    System.out.println("Informe a altura do ator: ");
                    at.setAltura(ler.nextFloat());
                    System.out.println("Informe o peso do ator: ");
                    at.setPeso(ler.nextFloat());
                    
                    ad.addAtor(at);
                    vrf=true;
                }else{
                    mo = new Modelo();
                    
                    System.out.println("Informe o nome do modelo: ");
                    mo.setNome(ler.nextLine());
                    System.out.println("Informe a idade do modelo: ");
                    mo.setIdade(ler.nextInt());
                    System.out.println("Informe a altura do modelo: ");
                    mo.setAltura(ler.nextFloat());
                    System.out.println("Informe o peso do modelo: ");
                    mo.setPeso(ler.nextFloat());
                    
                    md.addModelo(mo);
                vrf=true;
                }
            }
            
            System.out.println("Digite 1 para inserir mais atores/modelos ou 0 (zero) para sair: ");
            opc = ler.nextInt();
            ler.nextLine();
        }while(opc==1);
        
        System.out.println("Atores: ");
        ad.mostrarDados();
        System.out.println("Modelos: ");
        md.mostrarDados();
        
    }
}
