package aula.mdturma.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TurmaDTO {
    private String nomeTurma;
    private String nomeProfessor;
    private List<String> nomeAlunos;
}
