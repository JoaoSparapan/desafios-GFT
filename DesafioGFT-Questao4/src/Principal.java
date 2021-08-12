
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spara
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valida=1;
        do{
        System.out.print("Digite o valor da moto: ");    
        float precoFinal = teclado.nextFloat();
        if(precoFinal>0)
        {
           float avista = avista(precoFinal);
           System.out.println("\n\nPreco a vista - 30% de desconto: R$"+ avista + "\n");
           parcelas(precoFinal);
           System.out.println("Deseja realizar uma nova simulação?");
           System.out.println("1- Sim");
           System.out.println("2- Não");
           System.out.print("Escolha uma opção: ");
           valida = teclado.nextInt();
        }else{
            System.out.println("Valor inválido!");
        }
        }while(valida==1);
    }

    private static float avista(float valor) {
        return (float) (valor-(valor*0.3));
    }
    
    private static void parcelas(float valor)
    {
        int parcelas=5;
        float porcentagens=(float) 0.04;
        float total;
        float valorParcela;
        while(parcelas<=29)
        {
            total = valor*porcentagens+valor;
            valorParcela = total/parcelas;
            System.out.println("--------------------------------------");
            System.out.println("Quantidade de Parcelas: " + parcelas + "\n% de acréscimo: " + porcentagens*100 + "\nValor parcela: R$" + valorParcela);
            System.out.println("Valor final: R$" +  total);
            System.out.println("--------------------------------------\n");
            parcelas+=6;
            porcentagens+=0.03;
        }
    }

}
