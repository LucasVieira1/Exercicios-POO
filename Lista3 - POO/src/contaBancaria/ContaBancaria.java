package contaBancaria;

import javax.swing.JOptionPane;

public class ContaBancaria {

    private String banco;
    private String agencia;
    private String conta;
    private String tipo;
    private double valorSaldo;
    private double valorLimite;

    public ContaBancaria() {
    }

    public ContaBancaria(String banco, String agencia, String conta) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    public ContaBancaria(String banco, String agencia, String conta, String tipo, double valorSaldo, double valorLimite) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipo = tipo;
        this.valorSaldo = valorSaldo;
        this.valorLimite = valorLimite;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    public double depositar(double valor) {
        return valorSaldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= valorSaldo + valorLimite) {
            valorSaldo -= valor;
            return true;
        }
        if (valor > valorSaldo + valorLimite) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }
        return false;
    }

    public double verSaldo() {
        return valorSaldo + valorLimite;
    }

    public String VerExtrato() {
        return "Banco : " + banco
                + "\nAg : " + agencia
                + "\nCC : " + conta
                + "\nTipo: " + tipo
                + "\nSaldo : " + valorSaldo
                + "\nLimite : " + valorLimite
                + "\nSaldo total : " + verSaldo();
    }

}
