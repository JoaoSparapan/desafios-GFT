/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spara
 */
public class ModeloDAO {
    public List<Modelo> lm = new ArrayList();

    public void mostrarDados(){
        for(Modelo m: lm){
            System.out.println(m.toString());
        }
    }

    public void addModelo(Modelo m){
        this.lm.add(m);
    }
}
