package Exercicio2;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int opc = 0;
        String nome, ra;
        float ac1, ac2, ag, af;
        
        Aluno aluno = null;
        
          while (opc != 3) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("---------MENU---------\n1 - Criar aluno\n2 - Mostrar aluno\n3 - Sair"));

    switch (opc) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome:");
                    ra= JOptionPane.showInputDialog("Digite o ra:");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a AC2:"));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a AC2:"));
                    ag = Float.parseFloat(JOptionPane.showInputDialog("Digite a AG:"));
                    af = Float.parseFloat(JOptionPane.showInputDialog("Digite a AF:"));
                    
                    aluno = new Aluno();
                    
                    aluno.setNome(nome);
                    aluno.setRa(ra);
                    aluno.setAC1(ac1);
                    aluno.setAC2(ac2);
                    aluno.setAG(ag);
                    aluno.setAF(af);
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, aluno.imprimir());
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