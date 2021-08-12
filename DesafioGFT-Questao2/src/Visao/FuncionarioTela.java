/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.FuncionarioDAO;
import Enum.Cargo;
import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author spara
 */
public class FuncionarioTela {
    public static void main(String[] args){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario f;
        Scanner teclado = new Scanner(System.in);
        int opc=0;
        do{
        f = new Funcionario();
        System.out.print("Digite o nome do funcionário: ");
        f.setNome(teclado.nextLine());
        System.out.println("CARGOS: ");
        System.out.println("1- Estagiário");
        System.out.println("2- Junior");
        System.out.println("3- Sênior");
        System.out.println("Digite o código correspondente ao cargo do funcionário: ");
        int cargo = teclado.nextInt();
        switch(cargo)
        {
            case 1:
                f.setCargo(Cargo.ESTAGIÁRIO.toString());
                f.setSalario(800);
                break;
            case 2:
                f.setCargo(Cargo.JÚNIOR.toString());
                f.setSalario(1200);
                break;
            case 3:
                f.setCargo(Cargo.SÊNIOR.toString());
                f.setSalario(2500);
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
        funcionarioDAO.addFuncionario(f);
        System.out.println("\n1- Para cadastrar outro funcionário");
        System.out.println("2- Para sair");
        System.out.print("Digite sua opção: ");
        opc = teclado.nextInt();
        teclado.nextLine();
        }while(opc==1);
        System.out.println("Lista de Funcionários:");
        System.out.println("----------------------");
        funcionarioDAO.mostrarDados();
        
    }
}
