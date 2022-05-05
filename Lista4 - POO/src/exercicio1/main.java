/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        ArrayList<Aluno> aluno = new ArrayList<>();
        int opc = 0, opc2 = 0;
        String ra, nome, curso, anoConclusaoEnsinoMedio, anoConclusaoGraduacao, i = "";

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("---Menu--- "
                    + "\n1 - Inserir aluno"
                    + "\n2 - Exibir aluno"
                    + "\n3 - Sair"));

            switch (opc) {
                case 1:
                    opc2 = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Aluno Graduação" + "\n2 - Aluno pós graduação" + "\n3 - Sair"));
                    switch (opc2) {
                        case 1:
                            ra = JOptionPane.showInputDialog("Digite o ra:");
                            nome = JOptionPane.showInputDialog("Digite o nome:");
                            curso = JOptionPane.showInputDialog("Digite o curso:");
                            anoConclusaoEnsinoMedio = JOptionPane.showInputDialog("Digite o ano de conclusão do ensino médio:");
                            aluno.add(new AlunoGraduacao(ra, nome, curso, anoConclusaoEnsinoMedio));
                            break;
                        case 2:
                            ra = JOptionPane.showInputDialog("Digite o ra:");
                            nome = JOptionPane.showInputDialog("Digite o nome:");
                            curso = JOptionPane.showInputDialog("Digite o curso:");
                            anoConclusaoGraduacao = JOptionPane.showInputDialog("Digite o ano de conclusão da graduação:");
                            aluno.add(new AlunoGraduacao(ra, nome, curso, anoConclusaoGraduacao));

                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção incorreta!");
                            break;
                    }

                    break;
                case 2:
                    for (Aluno x : aluno) {
                        i += x + "\n";
                    }

                    JOptionPane.showMessageDialog(null, i);

                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta!");
                    break;
            }

        }

    }

}

