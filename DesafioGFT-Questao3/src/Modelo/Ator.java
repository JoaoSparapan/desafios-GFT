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
public class Ator extends Modelo{
    private int nivelAtor;
    Trabalho t;
    public Ator() {
        t = new Trabalho("Novelas");
    }

    public Ator(int nivelAtor, String nome, float altura, float peso, int idade) {
        super(nome, altura, peso, idade);
        this.nivelAtor = nivelAtor;
        t = new Trabalho("Novelas");
    }

    public Ator(String nome, float altura, float peso, int idade) {
        super(nome, altura, peso, idade);
        t = new Trabalho("Novelas");
    }


    public int getNivelAtor() {
        return nivelAtor;
    }

    public void setNivelAtor(int nivelAtor) {
        this.nivelAtor = nivelAtor;
    }

    @Override
    public String toString() {
        return "Ator{" +"nome=" + getNome() + ", altura=" + getAltura() + ", peso=" + getPeso() + ", idade=" + getIdade() + " nivelAtor=" + nivelAtor + ", trabalho=" + t + '}';
    }
}