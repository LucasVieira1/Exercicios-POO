package Exercicio3;

class Funcionario {
    
   private int cracha;
   private String nome;
   private char TipoVinculo;
   private float ValorHora;
   private float QtDeHora;
   private float salario;
   private float ValorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(char TipoVinculo) {
        this.TipoVinculo = TipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    public float getQtDeHora() {
        return QtDeHora;
    }

    public void setQtDeHora(float QtDeHora) {
        this.QtDeHora = QtDeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(float ValorDesconto) {
        this.ValorDesconto = ValorDesconto;
    }
   
    public float calcularValorSalario(){
        if(TipoVinculo == 'H'){
            return  ValorHora * QtDeHora - ValorDesconto;
        }
        return salario - ValorDesconto;   
    }

    public String imprimir() {
        if (TipoVinculo == 'H') {
            salario = ValorHora * QtDeHora;
            return "Cracha : " + cracha 
                    + "\nnome : " + nome + 
                    "\nVínculo : " + TipoVinculo + 
                    "\nSalário : " + salario + 
                    "\nDesconto : " + ValorDesconto + 
                    "\nValor a receber : " + calcularValorSalario();
        }
        return "Cracha : " + cracha +
                "\nnome : " + nome + 
                "\nVínculo : " + TipoVinculo + 
                "\nSalário : " + salario +
                "\nDesconto : " + ValorDesconto + 
                "\nValor a receber : " + calcularValorSalario();

    }

}
