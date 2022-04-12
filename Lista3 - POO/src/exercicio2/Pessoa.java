package exercicio2;

import java.util.ArrayList;

public class Pessoa {

    private int codigo;
    private String nome;
    ArrayList<Automovel> automoveis;

    public Pessoa() {
        automoveis = new ArrayList();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
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

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    public void inserirAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removerAutomovel(Automovel automovel) {
        automoveis.remove(automovel);
    }

    public String imprimir() {
        return "Codigo da pessoa: " + codigo + "\nnome: " + nome;
    }

    public String imprimirCompleto() {
        String msg = imprimir() + "\n";
        for (Automovel automovel : automoveis) {
            msg += "\n" + automovel.imprimir() + "\n";
        }
        return msg;
    }

}
