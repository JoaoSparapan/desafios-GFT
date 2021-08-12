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
public class Modelo {
    private String nome;
    private float altura;
    private float peso;
    private int idade;
    Trabalho t;

    public Modelo() {
        t = new Trabalho("Malhação");
    }

    public Modelo(String nome, float altura, float peso, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        t = new Trabalho("Malhação");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Modelo{" + "nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade=" + idade + ", trabalho=" + t + '}';
    }
}
