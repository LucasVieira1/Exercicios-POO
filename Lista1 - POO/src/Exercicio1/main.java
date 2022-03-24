package Exercicio1;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opc = 0;
        String nome, cpf;
        Object[] arraySexo = {"Feminino", "Masculino"};
        char sexo;
        int idade;

        Pessoa pessoa = null;

        while (opc != 3) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("---------MENU---------\n1 - Criar pessoa\n2 - Mostrar pessoa\n3 - Sair"));

            switch (opc) {
                case 1:

                    nome = JOptionPane.showInputDialog("Digite o nome!");
                    cpf = JOptionPane.showInputDialog("Digite o CPF!");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade!"));
                    sexo = JOptionPane.showInputDialog(null,
                            "Selecione o sexo!", "Seleciona",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            arraySexo, arraySexo[0]).toString().charAt(0);
                    pessoa = new Pessoa();
                    pessoa.setCpf(cpf);
                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    pessoa.setSexo(sexo);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, pessoa.imprimir());
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                    break;

            }

        }

    }
}
