package exercicio1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoGraduacao extends Aluno{

    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {
    }
    
    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    @Override
    public String toString(){
        return super.toString() + "Ano de conclusão do ensino médio: " + anoConclusaoEnsinoMedio;
    }
    
}
