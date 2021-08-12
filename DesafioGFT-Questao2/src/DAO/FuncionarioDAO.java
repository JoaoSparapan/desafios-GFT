/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Enum.Cargo;
import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author spara
 */
public class FuncionarioDAO {
    public List<Funcionario> listaFuncionarios = new ArrayList();
    
    public void mostrarDados(){
        for(Funcionario f: listaFuncionarios){
            System.out.println(f.toString());
            System.out.print("Local de trabalho: ");
            mostrarLocalTrabalho(f);
            System.out.println("----------------------");
        }
    }
    
    public void addFuncionario(Funcionario f)
    {
        this.listaFuncionarios.add(f);
    }
    
    public void mostrarLocalTrabalho(Funcionario f)
    {
        if(f.getCargo().equals("ESTAGIÁRIO"))
        { 
            System.out.println("100% HOME OFFICE");
        }
        else{  
          if(f.getCargo().equals("JÚNIOR"))
          { 
              System.out.println("PRESENCIAL");
          }
          else{
              System.out.println("HÍBRIDO");
          }
        }
        
    }
}
