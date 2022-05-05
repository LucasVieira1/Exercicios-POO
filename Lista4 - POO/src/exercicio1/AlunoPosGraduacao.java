package exercicio1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AlunoPosGraduacao extends Aluno {

    private String anoConclusaoGraduacao;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    @Override
    public String toString() {
        return super.toString() + "Ano de conclusão da graduação: " + getAnoConclusaoGraduacao();
    }
}
