package exercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionario = new ArrayList<>();
        int opc = 0, opc2 = 0;
        String nome, matricula, i = "";
        double salario;
        float percentual;

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("---Menu--- "
                    + "\n1 - Criar funcionário"
                    + "\n2 - Mostrar funcionários "
                    + "\n3 - Sair"));

            switch (opc) {

                case 1:
                    opc2 = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Funcionario" + "\n2 - Consultor"));
                    switch (opc2) {
                        case 1:
                            nome = JOptionPane.showInputDialog("Digite o nome:");
                            matricula = JOptionPane.showInputDialog("Digite a matricula:");
                            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));
                            funcionario.add(new Funcionario(matricula, nome, salario));
                            break;
                        case 2:
                            nome = JOptionPane.showInputDialog("Digite o nome:");
                            matricula = JOptionPane.showInputDialog("Digite a matricula:");
                            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite a salario:"));
                            funcionario.add(new Consultor(matricula, nome, salario));
                            break;
                    }
                    break;
                case 2:
                      for (Funcionario x : funcionario) {
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
