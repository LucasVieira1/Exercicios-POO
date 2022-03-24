package Exercicio3;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int cracha, opc = 0;
        String nome;
        Object[] arrayTipo = {"Hora", "Mensal"};
        char tipovinculo = arrayTipo.toString().charAt(0);
        float ValorHora = 0, QtDeHora = 0, salario = 0, ValorDesconto;

        Funcionario funcionario = null;

        while (opc != 4) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("---------MENU---------\n1 - Criar funcionÃ¡rio\n2 - Mostrar folha de pagamento\n3 - Alterar remuneraÃ§Ã£o \n4 - Sair"));

            switch (opc) {

                case 1:
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite seu cracha:"));
                    nome = JOptionPane.showInputDialog("Digite seu nome:");
                    tipovinculo = JOptionPane.showInputDialog(null, "Selecione Tipo de Vinculo:", "Selecione",
                            JOptionPane.INFORMATION_MESSAGE, null, arrayTipo, arrayTipo[0]).toString().charAt(0);

                    if (tipovinculo == 'H') {
                        ValorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de Hora:"));
                        QtDeHora = Float.parseFloat(JOptionPane.showInputDialog("Digite a Quantidade de Hora:"));
                    } else {
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Salario:"));
                    }

                    ValorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Digite valor do Desconto:"));

                    funcionario = new Funcionario();
                    funcionario.setCracha(cracha);
                    funcionario.setNome(nome);
                    funcionario.setTipoVinculo(tipovinculo);
                    funcionario.setValorHora(ValorHora);
                    funcionario.setQtDeHora(QtDeHora);
                    funcionario.setSalario(salario);
                    funcionario.setValorDesconto(ValorDesconto);

                    break;

                 case 2:
                    JOptionPane.showMessageDialog(null, funcionario.imprimir());
                  break;

                case 3:

                    if (funcionario != null) {
                        if (tipovinculo == arrayTipo[0].toString().charAt(0)) {
                            ValorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto vale a hora: "));
                            QtDeHora = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas: "));
                            funcionario.setValorHora(ValorHora);
                            funcionario.setQtDeHora(QtDeHora);
                        } else {
                            salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do funcionario: "));
                            funcionario.setSalario(salario);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionario cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÃ‡ÃƒO INVÃ�LIDA!", "ATENÃ‡ÃƒO", JOptionPane.WARNING_MESSAGE);
                    break;

            }

        }

    }
}
