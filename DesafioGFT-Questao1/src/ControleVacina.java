/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spara
 */
public class ControleVacina{
    public static void main(String[] args) {


            Scanner ler = new Scanner(System.in);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String vacina="",data;
            Date dataEscolhida = null;
            do{

                System.out.println("Informe a vacina: (Coronavac ou Janssen)");
                vacina = ler.nextLine();
            }while(!"CORONAVAC".equals(vacina.toUpperCase()) && !"JANSSEN".equals(vacina.toUpperCase()));

        try {
            System.out.println("Infome a data: (dd/MM/yyyy)");
            data = ler.nextLine();

            dataEscolhida = formato.parse(data);
        } catch (ParseException ex) {
            System.out.println("Formato da data deve ser: (dia/mes/ano)");
        }
        System.out.println("VACINA: "+vacina);

        Calendar cal = Calendar.getInstance();
        if(vacina.toUpperCase().equals("CORONAVAC")){
            System.out.println("DATA DA PRIMEIRA DOSE: "+formato.format(dataEscolhida));
            cal.setTime(dataEscolhida);
            cal.add(Calendar.DAY_OF_MONTH, 14);
            dataEscolhida = cal.getTime();
            System.out.println("DATA DA SEGUNDA DOSE: "+formato.format(dataEscolhida));
        }else{
            System.out.println("DATA DA DOSE: "+formato.format(dataEscolhida));
        }










    }
}
