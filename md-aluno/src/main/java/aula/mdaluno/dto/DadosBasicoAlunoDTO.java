package aula.mdaluno.dto;

import aula.mdaluno.model.Aluno;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class DadosBasicoAlunoDTO {
    private Long id;
    private String nome;

    public DadosBasicoAlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
    }

}
