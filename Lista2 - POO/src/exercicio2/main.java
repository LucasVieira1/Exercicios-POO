/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opc = 0;
        String nome;
        int codigo;
        double percentualComissao, valorVenda, desconto;
        Vendedor v1 = null;

        while (opc != 3) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("---------MENU---------\n1 - Cadastrar vendedor\n2 - Calcular Venda\n3 - Sair"));

            switch (opc) {
                case 1:

                    v1 = new Vendedor(codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código")),
                            nome = JOptionPane.showInputDialog("Digite o nome"),
                            percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de comissão")));

                    break;
                case 2:                   
                   v1.calcularPagamentoComissao(valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda")),
                                       desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto")));

                    JOptionPane.showMessageDialog(null, v1.imprimir(valorVenda, desconto) );
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
