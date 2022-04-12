package exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class main {

    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        String nome, nomea, ra, rs, msg = null;
        int codigo, cargaHoraria, opc = 0;
        Curso cursoSelecionado = null;

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1 - Criar curso"
                    + "\n2 - Criar Aluno"
                    + "\n3 - Remover aluno"
                    + "\n4 - Mostrar todos os cursos"
                    + "\n5 - Mostrar alunos do curso"
                    + "\n6 - Sair"));

            if (opc == 2 || opc == 3 || opc == 5) {
                cursoSelecionado = buscarCurso(cursos);
                if (cursoSelecionado == null) {
                    continue;
                }

            }

            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
                    nome = JOptionPane.showInputDialog("Digite o nome: ");
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária: "));
                    cursos.add(new Curso(codigo, nome, cargaHoraria));
                    break;
                case 2:
                    ra = JOptionPane.showInputDialog("Digite o RA: ");
                    nomea = JOptionPane.showInputDialog("Digite o nome: ");
                    cursoSelecionado.inserirAluno(new Aluno(ra, nomea));
                    break;
                case 3:
                    rs = JOptionPane.showInputDialog("Selecione um aluno por RA: \n");
                    cursoSelecionado.imprimirCompleto();

                    for (Aluno a : cursoSelecionado.getAlunos()) {
                        if (a.getRa().equals(rs)) {
                            cursoSelecionado.removerAluno(a);
                        }
                    }
                    break;
                case 4:
                    for (Curso c : cursos) {
                        msg += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, cursoSelecionado.imprimirCompleto());
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showInputDialog("Opção incorreta!");
                    break;
            }
        }

    }

    private static Curso buscarCurso(ArrayList<Curso> cursos) {
        String msg = "Selecione o curso pelo código:\n ";
        for (Curso c : cursos) {
            msg += c.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Curso c : cursos) {
            if (c.getCodigo() == cod) {
                return c;
            }
        }
        return null;
    }
}
