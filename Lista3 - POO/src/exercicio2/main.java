package exercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        ArrayList<Automovel> automoveis = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        String nome, marca, modelo, rs, msg = null, codigoc;
        int codigo, opc = 0, id = 0;
        Pessoa pessoaSelecionada = null;
        Pessoa pessoaSelecionada2 = null;
        boolean escolha = false;

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1 - Criar pessoa"
                    + "\n2 - Criar automovél"
                    + "\n3 - Transferir automóvel"
                    + "\n4 - Mostrar todas as pessoas"
                    + "\n5 - Mostrar automóvel da pessoa"
                    + "\n6 - Sair"));

            if (opc == 2 || opc == 3 || opc == 5) {
                pessoaSelecionada = buscarPessoa(pessoas);
                if (pessoaSelecionada == null) {
                    JOptionPane.showMessageDialog(null, "O código da pessoa selecionada não existe!");
                    continue;
                }

            }

            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
                    nome = JOptionPane.showInputDialog("Digite o nome: ");
                    pessoas.add(new Pessoa(codigo, nome));
                    break;
                case 2:
                    // id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id para o carro!: "));
                    marca = JOptionPane.showInputDialog("Digite a marca: ");
                    modelo = JOptionPane.showInputDialog("Digite o modelo: ");
                    pessoaSelecionada.inserirAutomovel(new Automovel(marca, modelo));
                    break;
                case 3:
                    escolha = false;
                    Automovel auto = null;
                    rs = JOptionPane.showInputDialog("Selecione o modelo do carro para transferência: \n" + pessoaSelecionada.imprimirCompleto());
                    for (Automovel a : automoveis) {
                        rs += a.imprimir() + "\n";
                    }
                    for (Automovel a : pessoaSelecionada.getAutomoveis()) {
                        if (a.getModelo().equals(rs)) {
                            escolha = true;
                            auto = a;
                            pessoaSelecionada2 = buscarPessoa2(pessoas);
                            if (pessoaSelecionada2 == null) {
                                JOptionPane.showMessageDialog(null, "O código da pessoa selecionada não existe!");
                                continue;
                            }

                        }
                    }
                    if (escolha == false) {
                        JOptionPane.showMessageDialog(null, "O modelo do carro selecionado não existe!");
                    } else {

                        pessoaSelecionada.removerAutomovel(auto);
                        pessoaSelecionada2.inserirAutomovel(auto);
                        JOptionPane.showMessageDialog(null, "Veículo transferido!!");
                    }

                    break;
                case 4:
                    for (Pessoa c : pessoas) {
                        msg += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, pessoaSelecionada.imprimirCompleto());
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showInputDialog("Opção incorreta!");
                    break;
            }
        }

    }

    private static Pessoa buscarPessoa(ArrayList<Pessoa> pessoas) {
        String msg = "Selecione a pessoa pelo código:\n";
        for (Pessoa c : pessoas) {
            msg += c.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Pessoa c : pessoas) {
            if (c.getCodigo() == cod) {
                return c;
            }
        }
        return null;
    }

    private static Pessoa buscarPessoa2(ArrayList<Pessoa> pessoas) {
        String msg = "Selecione a pessoa para transferir pelo código:\n";
        for (Pessoa c : pessoas) {
            msg += c.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Pessoa c : pessoas) {
            if (c.getCodigo() == cod) {
                return c;
            }
        }
        return null;
    }
    /*
    private static Automovel buscarAutomovel(ArrayList<Automovel> automoveis) {
        String msg = "Selecione o automovel para transferir pelo código:\n";
        for (Automovel c : automoveis) {
            msg += c.imprimir() + "\n";
        }
        for (Automovel c : pessoaSelecionada.getAutomoveis()) {
            if (c.getModelo().equals(msg)) {
                return c;
            }
        }
        return null;
    }
     */
}
