/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author spara
 */
public class Trabalho {
    private String descricao;

    public Trabalho() {
    }

    public Trabalho(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Trabalho{" + "descricao=" + descricao + '}';
    }

}
