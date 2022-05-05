package exercicio3;


public class Consultor extends Funcionario {

    public Consultor(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    
    @Override
    public double getSalario() {
        return super.getSalario() + (super.getSalario() * 10) / 100;
    }

    
    public double getSalario(float percentual) {
        return getSalario() + (getSalario() * percentual) / 100;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
