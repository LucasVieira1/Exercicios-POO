/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Curso {

    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList();
    }

    public Curso(int codigo, String nome, int cargaHorario) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHorario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
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

    public int getCargaHorario() {
        return cargaHoraria;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHoraria = cargaHorario;
    }

    public ArrayList<Aluno> getLista() {
        return alunos;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.alunos = lista;
    }

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int index) {
        alunos.remove(index);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public String imprimir() {
        return "Nome: " + nome + "\nCódigo" + codigo + "\nCarga Horária: " + cargaHoraria;
    }

    public String imprimirCompleto() {
        String msg = imprimir() + "\n Alunos \n";
        for (Aluno aluno : alunos) {
            msg += aluno.imprimir() + "\n";
        }
        return msg;
    }
    


}
