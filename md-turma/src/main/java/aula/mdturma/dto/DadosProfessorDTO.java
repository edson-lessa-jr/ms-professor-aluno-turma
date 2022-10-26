package aula.mdturma.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DadosProfessorDTO {
    private Long id;
    private String nome;


    @Override
    public String toString() {
        return "DadosProfessorDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
