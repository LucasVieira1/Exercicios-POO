/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

public class Vendedor {

    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {

    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda) {
     return (valorVenda * percentualComissao) / 100; 
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
     return calcularPagamentoComissao(valorVenda) - desconto; 
    }
    
    public String imprimir(double valorVenda, double desconto){
     return "Código : " + codigo
                + "\nnome : " + nome
                + "\nValor de Venda : " + valorVenda
                + "\n% da comissão : " + percentualComissao + "%"
                + "\nDesconto : " + desconto
                + "\nValor a pagar : " + calcularPagamentoComissao(valorVenda, desconto);
         
    }

}
