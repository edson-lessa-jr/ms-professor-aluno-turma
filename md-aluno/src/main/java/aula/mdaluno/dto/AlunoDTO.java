package aula.mdaluno.dto;


import aula.mdaluno.model.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AlunoDTO {
    private String nome;
    private String dataNascimento;

    public AlunoDTO(Aluno aluno) {
        this.nome = aluno.getNome();
        this.dataNascimento = aluno.getDataFormatada();
    }

    public Aluno converterParaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(this.nome);
        aluno.setDataNascimento(this.dataNascimento);
        return aluno;
    }
}
