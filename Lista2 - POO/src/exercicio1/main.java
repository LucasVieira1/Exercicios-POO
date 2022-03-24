/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opc = 0;
        Object[] arraySexo = {"Feminino", "Masculino"};
        String nome;
        char sexo;
        int idade, numero;
        double valorAutomovel;
        Apolice a1 = null;
        while (opc != 3) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("---------MENU---------\n1 - Criar apolice\n2 - Ver dados apolice\n3 - Sair"));

            switch (opc) {
                case 1:

                    a1 = new Apolice(numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número")),
                            nome = JOptionPane.showInputDialog("Digite o nome"),
                            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")),
                            sexo = JOptionPane.showInputDialog(null, "Selecione o sexo!", "Seleciona", JOptionPane.INFORMATION_MESSAGE, null, arraySexo, arraySexo[0]).toString().charAt(0),
                            valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do automovel")));

                    break;
                case 2:
                    a1.calculaValor();
                    JOptionPane.showMessageDialog(null, a1.imprimir());
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
