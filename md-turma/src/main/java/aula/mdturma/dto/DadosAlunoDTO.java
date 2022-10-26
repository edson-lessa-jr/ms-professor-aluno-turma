package aula.mdturma.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DadosAlunoDTO {
    private Long id;
    private String nome;

    public DadosAlunoDTO(String nome) {
        this.nome = nome;
    }

    public DadosAlunoDTO(Long id) {
        this.id = id;
    }


}
