package contaBancaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opc = 0;
        ArrayList<ContaBancaria> lista = new ArrayList<ContaBancaria>();
        String banco, agencia, conta, tipo, escolha;
        double valorSaldo, valorLimite;
        ContaBancaria contaBancaria = null;
        boolean teste = false;

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("------MENU------"
                    + "\n1 - Abrir uma nova conta"
                    + "\n2 - Sacar"
                    + "\n3 - Depositar"
                    + "\n4 - Extrato"
                    + "\n5 - Aumentar limite"
                    + "\n6 - Sair"));

            switch (opc) {
                case 1:
                    banco = JOptionPane.showInputDialog("Digite o banco");
                    agencia = JOptionPane.showInputDialog("Digite a agência");
                    conta = JOptionPane.showInputDialog("Digite a conta");
                    tipo = JOptionPane.showInputDialog("Digite o tipo");
                    valorSaldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saldo"));
                    valorLimite = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor limite"));

                    lista.add(new ContaBancaria(banco, agencia, conta, tipo, valorSaldo, valorLimite));
                    break;
                case 2:
                    teste = false;
                    escolha = JOptionPane.showInputDialog("Qual a conta para saque?");
                    for (ContaBancaria contabancaria : lista) {
                        if (escolha.equals(contabancaria.getConta())) {
                            teste = true;
                            JOptionPane.showMessageDialog(null, contabancaria.sacar(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque?"))));
                        }
                    }

                    if (teste == false) {
                        JOptionPane.showMessageDialog(null, "A conta não existe!");
                    }

                    break;
                case 3:
                    teste = false;
                    escolha = JOptionPane.showInputDialog("Qual a conta para deposito?");
                    for (ContaBancaria contabancaria : lista) {
                        if (escolha.equals(contabancaria.getConta())) {
                            double valord = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do depósito?"));
                            if ((valord + contabancaria.getValorSaldo()) <= contabancaria.getValorLimite()) {
                                JOptionPane.showMessageDialog(null, contabancaria.depositar(valord));
                                teste = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "ERRO! Seu limite é de: " + contabancaria.getValorLimite());
                                teste = true;
                            }
                        }
                    }
                    if (teste == false) {
                        JOptionPane.showMessageDialog(null, "A conta não existe!");
                    }

                    break;
                case 4:
                    teste = false;
                    escolha = JOptionPane.showInputDialog("Qual a conta para ver o extrato?");
                    for (ContaBancaria contabancaria : lista) {
                        if (escolha.equals(contabancaria.getConta())) {
                            JOptionPane.showMessageDialog(null, contabancaria.VerExtrato());
                            teste = true;

                        }
                    }
                    if (teste == false) {
                        JOptionPane.showMessageDialog(null, "A conta não existe!");
                    }

                    break;

                case 5:
                    teste = false;
                    escolha = JOptionPane.showInputDialog("Qual a conta para atualizar o limite?");
                    for (ContaBancaria contabancaria : lista) {
                        if (escolha.equals(contabancaria.getConta())) {
                            double newLimite = Double.parseDouble(JOptionPane.showInputDialog("Qual o novo limite?"));
                            contabancaria.setValorLimite(newLimite);
                            teste = true;
                        }
                    }
                    if (teste == false) {
                        JOptionPane.showMessageDialog(null, "A conta não existe!");
                    }
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }

        }

    }
}
