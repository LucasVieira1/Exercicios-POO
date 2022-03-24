/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author aluno
 */
public class Apolice {

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    private Apolice() {

    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calculaValor() {
        if (sexo == 'M' && idade <= 25) {
            return (valorAutomovel * 10) / 100;
        }
        if (sexo == 'M' && idade > 25) {
            return (valorAutomovel * 5) / 100;
        }
        return (valorAutomovel * 2) / 100;
    }

    public String imprimir() {
        return "Número : " + numero
                + "\nnome : " + nome
                + "\nIdade : " + idade
                + "\nsexo : " + sexo
                + "\nValor Automovel : " + valorAutomovel
                + "\nValor apolice : " + calculaValor();

    }

}
