/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Ator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spara
 */
public class AtorDAO {
    public List<Ator> la = new ArrayList();

    public void mostrarDados(){
        for(Ator a: la){
            System.out.println(a.toString());
        }
    }

    public void addAtor(Ator a){
        this.la.add(a);
    }

}
